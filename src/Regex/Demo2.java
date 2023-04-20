package Regex;

public class Demo2 {
    public static void main(String[] args) {
        String s = "我....我..我...我..要...要..要..要要..玩玩..玩玩玩..原原..原原..原神..神神...神神";
        s= s.replaceAll("\\.","");
        String regex = "(.)\\1+";
        s = s.replaceAll(regex,"$1"); // 替换字符从第1组拿 用$声明
        System.out.println(s);
    }
}
