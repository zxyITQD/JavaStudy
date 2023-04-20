package com.xiaoyan.study;

import java.util.Scanner;

/**
 * 模拟用户登录
 */
public class Demo3 {
    public static void main(String[] args) {
        String username = "user";
        String possword = "1234asd";
        Scanner s = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            System.out.println("请输入用户名：");
            String name = s.nextLine();
            System.out.println("请输入密码：");
            String psw = s.nextLine();
            if (name.equals(username) && psw.equals(possword)) {
                System.out.println("登录成功!");
                break;
            } else {
                count++;
                if (count != 5) {
                    System.out.println("用户名或密码错误，请重新输入，你还有" + (5 - count) + "次机会");
                } else {
                    System.out.println("登录次数过多，请2小时后再输入");
                }

            }
        }
    }

}
