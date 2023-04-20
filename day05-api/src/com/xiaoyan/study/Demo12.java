package com.xiaoyan.study;

/**
 * 一段很长的文本：
 *     查找符合要求（是英文字母或者空格）的连续子串，最长的那个。
 *
 *     sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world
 *
 *     记录找到的每个子串，与之前找到的比较。
 */
public class Demo12 {
    public static void main(String[] args) {
        String str = "sdfsdafsad!@#$SADFSDAF!@#$231sadfsadf123123sadf1234hello world";
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

    /**
     * 定义满足条件的方法
     * @param c
     * @return
     */
    public static boolean isCode(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == 32);
    }
}
