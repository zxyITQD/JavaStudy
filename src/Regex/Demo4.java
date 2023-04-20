package Regex;

// 正则表达式的替换
/*
 将下面文本中的手机号码全部使用****代替
 张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432
 */
public class Demo4 {
    public static void main(String[] args) {

        String phoneNum = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432";
        String regex = "1[3-9]\\d{9}";
        //匹配到的字符全部替换
        System.out.println(phoneNum.replaceAll(regex, "*****"));
        //匹配的字符只替换第一个字串
        System.out.println(phoneNum.replaceFirst(regex, "*****"));
    }
}
