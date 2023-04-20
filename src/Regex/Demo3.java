package Regex;
// 正则表达式的校验
public class Demo3 {
    public static void main(String[] args) {
        String regex = "13[0-9]\\d{8}";
        String  n= "13523451234";
        String n2 = "12323451784";
        String n3 = "13256781234";
        System.out.println(n.matches(regex));
        System.out.println(n2.matches(regex));
        System.out.println(n3.matches(regex));
    }
}
