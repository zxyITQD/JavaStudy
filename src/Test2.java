import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个三位数的正整数：");
        int num = in.nextInt();
        if (num < 0 || num - 100 < 0) {
            System.out.println("您输入的数据不合法！");
            System.out.println("请重新输入");

        } else {
            int a = num / 100;
            int b = (num % 100) / 10;
            int c = (num % 100) % 10;
            int d = a + b + c;
            System.out.println("每位数字之和为：" + d);
        }
    }
}
