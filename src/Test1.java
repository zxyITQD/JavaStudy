import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//        int x = 5;
//        int y = 5;
//        System.out.println(x++ > 5 & --y < 5);
//        System.out.println(x);
//        System.out.println(y);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        int c = a - b < 0 ? b - a : a - b;
        System.out.println("它们的差值为：" + c);

    }

}
