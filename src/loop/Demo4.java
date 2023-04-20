package loop;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // 死循环
        // for(; ;){}
        // while(true){}
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("请输入分数：");
            int score = in.nextInt();
            if(score >= 1 && score <=100){
                System.out.println("输入正确！");
                break;
            } else {
                System.out.println("格式错误!");
            }
        }
    }
}
