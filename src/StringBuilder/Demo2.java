package StringBuilder;

import java.util.Scanner;

// 判断回文字符串
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文本:");
        String in = sc.nextLine();
        if(isHuiWen(in)){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }
    }
    //定义方法
    public static boolean isHuiWen(String s) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(s);
//        String s2 = sb.reverse().toString();
//        return s == s2;
        return s.equals(new StringBuilder(s).reverse().toString());// 链式编程
    }
}
