package loop;

import java.util.Scanner;

// 某客服系统有服务满意度反馈系统，输入数字1、2、3、4分别表示非常满意、基本满意、不太满意、非常不满意
public class Demo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = in.nextInt();
        // 典型的switch循环
        switch (num) {
            case 1:
                System.out.println("非常满意");
                break;
            case 2:
                System.out.println("基本满意");
                break;
            case 3:
                System.out.println("不太满意");
                break;
            case 4:
                System.out.println("非常不满意");
                break;
            default:
                System.out.println("您输入的数字不合法！");
        }
    }
}
