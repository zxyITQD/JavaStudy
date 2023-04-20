package com.xiaoyan.study;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的案例 讲义 5个代码
 */
public class Demo9 {
    public static void main(String[] args) {
        /**
         * 正则表达式的校验
         */
        String regex = "13[0-9]\\d{8}";
        String  n= "13523451234";
        String n2 = "12323451784";
        String n3 = "13256781234";
        System.out.println(n.matches(regex));
        System.out.println(n2.matches(regex));
        System.out.println(n3.matches(regex));
        /**
         * 正则表达式的替换
         */
        String phoneNum = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432";
        String regex3 = "1[3-9]\\d{9}";
        //匹配到的字符全部替换
        System.out.println(phoneNum.replaceAll(regex3, "*****"));
        //匹配的字符只替换第一个字串
        System.out.println(phoneNum.replaceFirst(regex3, "*****"));
        /**
         * 正则表达式的拆分
         */
        String s = "bb:cc:dd";
        String[] arr = s.split(":");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));// [bb, cc, dd]
        String s2 = "boo:adofoo";
        String[] arr2 = s2.split("o");
        System.out.println(Arrays.toString(arr2));// [b, , :ad, f]
        String str = "11 22   33  44     55";
        String[] arr3 = str.split("\\s+");
        System.out.println(Arrays.toString(arr3));// [11, 22, 33, 44, 55]
        /**
         * 正则表示式的获取
         */
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
        /**
         * 捕获组
         */
        String s3 = "我....我..我...我..要...要..要..要要..玩玩..玩玩玩..原原..原原..原神..神神...神神";
        s3= s3.replaceAll("\\.","");
        String regex4 = "(.)\\1+";
        s3 = s3.replaceAll(regex4,"$1"); // 替换字符从第1组拿 用$声明
        System.out.println(s3);
    }
}
