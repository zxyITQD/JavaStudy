package com.xiaoyan.study;

/**
 * 完成数字和字符串的互换
 */
public class Demo6 {
    public static void main(String[] args) {
        int num = 36;
        Integer it = new Integer(num);
        String numStr = it.toString();
        System.out.println(numStr instanceof String);
        String numStr2 = String.valueOf(num);
        System.out.println(numStr2);
        String str = "1255";
        Integer it2 = new Integer(str);
        int newNum = it2.intValue();
        System.out.println(newNum);
    }
}
