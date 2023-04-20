package com.xiaoyan.study;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * 键盘录入一个字符串 统计其中的英文字母有多少个？
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String res = s.nextLine();
        int count = 0;
        for (int i = 0; i < res.length(); i++) {
            char c = res.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        System.out.println("英文字母有" + count + "个");
    }
}
