package loop;
// 由系统随机生成一个1-100之间的随机数，猜数字。

import java.util.Random;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random sc = new Random();
        // 生成1-100的随机数
        int num = sc.nextInt(100) + 1;
        System.out.println("游戏开始！");
        while (true) {
            System.out.println("请输入：");
            int a = in.nextInt();
            if (a < num) {
                System.out.println("猜小了");
            } else if (a > num) {
                System.out.println("猜大了");
            } else {
                System.out.println("恭喜你！猜对了");
                System.out.println("游戏结束");
                break;
            }
        }

    }
}
