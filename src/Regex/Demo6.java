package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 正则表达式的获取
public class Demo6 {
    public static void main(String[] args) {
        // Pattern对象是对一个正则表达式的编译表示 没有公告构造 需调用静态方法返回实例
        Pattern p = Pattern.compile("[1-9]{3}");
        // Matcher对象是对输入字符串进行解释和匹配操作的引擎
        Matcher m = p.matcher("123");
        // Matcher三个方法
        // 判断是否匹配
        System.out.println(m.matches());
        // 判断是否有满足匹配条件的下一个字串
        Matcher m2 = p.matcher("134adf353vd46");
        System.out.println(m2.find());// true
        System.out.println(m.find()); // false
        // 输出满足匹配条件的上一个字串（前提find方法为真）
        System.out.println(m2.group());
    }
}
