package loop;

import java.util.Scanner;

// 在数学中，素数也称为质数，是指在大于1的自然数中，
// 除了1和它本身以外不再有其他因子的自然数。请编写程序实现对输入的一个整数，判断是否是素数。
public class Demo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = in.nextInt();
        // 2是一个素数 除了2之外的自然数m 不能被2~m-1的数整除 能被自身整除
        boolean b = true;
        for (int i = 2; i <=Math.sqrt(num) ; i++) {
            if(num % i == 0 || num ==1){
                b= false;
            }
        }
        if(b){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }
    }
}
