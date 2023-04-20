package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = s.nextLine();
        int countStr = 0;
        int countInt = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                countStr++;
            } else if (c >= '0' && c <= '9'){
                countInt++;
            }
        }
        System.out.println("英文个数为"+countStr);
        System.out.println("数字个数为"+countInt);
    }
}
