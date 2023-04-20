package stringAPI;

/*
统计一段文本中的某个单词出现的次数
 */
public class StringCount {
    public static void main(String[] args) {
        String s = "djhjavaskjjavayuehhjavajava";
        String key = "java";
        System.out.println(getStrCount(s, key));
    }

    public static int getStrCount(String s, String key) {
        int count = 0;
        while (true) {
            int index = s.indexOf(key);
            if (index >= 0) {
                s = s.substring(index + key.length());
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
