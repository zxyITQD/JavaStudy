/*
面试题
一串很长的字符串 hd hdh#$55@2].--_sgshd^2·cjjdhd $742tvahzhvsv^4&bsb
找出英文字母连续或者空格的字串 找出最长的
 */
/*
首先遍历字符串 满足条件的字符拼接
没有满足条件 就把前一个满足条件的字串暂存 然后清空暂存 暂存下一个满足条件的
下一个满足条件的与前一个比较长度 长度大的记录 遍历完成
 */
// 用StringBuilder提升效率实现
public class Test11 {
    public static void main(String[] args) {
        String str = "hd hdffdsdh#$55@2].--_sgshdddfdsgh^2·cjjdhd $742tvahzhvsv^4&";
        // 定义结果字符串
        String result = "";
        // 定义暂存字符串
//        String temp = "";
        StringBuilder temp = new StringBuilder();

        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 满足条件暂存
            if (isCode(c)) {
//                temp += c;
                temp.append(c);
            }else{
                // 不满足条件的时候 记录字串
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
                // 记录字串完毕 清空缓存
//                temp = "";
                temp.delete(0,temp.length());
            }
            // 当最后一个字符也满足条件时也需要比较
            if(i == str.length() -1){
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
            }

        }
        System.out.println(result);
    }
    // 定义判断是否满足条件的方法
    public static boolean isCode(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == 32);
    }
}
