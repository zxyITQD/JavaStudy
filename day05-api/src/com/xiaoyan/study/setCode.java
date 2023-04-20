package com.xiaoyan.study;

import java.util.Random;
import java.util.Scanner;

/**
 * 生成验证码  四位的字符串  可选字符包含：大写字母小写字母数字
 *     通过索引操作数据
 */
public class setCode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String code = code();
            System.out.println("验证码为："+ code);
            System.out.println("输入验证码：");
            String str = s.nextLine();
            if(str.equalsIgnoreCase(code)){
                System.out.println("验证正确");
                break;
            }else {
                System.out.println("验证码错误，请重新输入");
            }
        }
    }


    /**
     * 定义生成验证码的方法
     */
    public static String code() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char i = 'a'; i < 'z'; i++) {
            sb.append(i);
        }
        for (char j = 'A'; j < 'Z'; j++) {
            sb.append(j);
        }
        for (int k = 0; k < 10; k++) {
            sb.append(k);
        }
        Random r = new Random();
        for (int l = 0; l < 4; l++) {
            int index = r.nextInt(sb.length());
            char c = sb.charAt(index);
            sb2.append(c);
        }
        return sb2.toString();
    }
}
