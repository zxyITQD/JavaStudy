package stringAPI;

import java.util.Scanner;

/*
2、将键盘录入的电话号码中间四位隐藏
 */
public class StringPhoneNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码:");
        String s = sc.nextLine();
        String jwtPhoneNum = s.substring(0,3).concat("****").concat(s.substring(7));
        System.out.println(jwtPhoneNum);

    }
}
