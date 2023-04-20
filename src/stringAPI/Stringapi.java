package stringAPI;

public class Stringapi {
    public static void main(String[] args) {

        String str = "shhdgjavajdeugjavaudyegjava";
        String key = "java";
        int strCount = getStrCount(str, key);
        System.out.println(strCount);
    }

    // 定义方法 返回指定字符串出现的次数
    public static int getStrCount(String str, String key) {
        int index = -1;
        int count = 0;
        while ((index = str.indexOf(key, index)) != -1) {
            count++;
            index = index + key.length();
        }
        return count;
    }
}
