package stringAPI;

import java.util.Scanner;

/*
模拟用户登录，给出5次机会
 */
public class StringDemoLogin {
    public static void main(String[] args) {
        String name = "user";
        String pwd = "123456";
        Scanner sr = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入用户名:");
            String n = sr.nextLine();
            System.out.println("请输入密码:");
            String p = sr.nextLine();
            if(n.equals(name) && p.equals(pwd) ){
                System.out.println("欢迎您");
                break;
            }else {
                System.out.println("用户名或密码错误,您的机会还有" +(4-i)+"次");
            }
        }
    }
}
