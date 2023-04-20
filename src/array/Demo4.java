package array;

import java.util.Scanner;

// 数组求和
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        // 循环存储键盘录入的值
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个值，共" + arr.length + "个值");
            arr[i] = sc.nextInt();
        }
        // 定义和
        int sum = 0;
        //遍历数组相加
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和为："+ sum);
    }
}
