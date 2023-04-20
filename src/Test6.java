import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = in.nextInt();
        // 90-100 A;  80-89 B；60-79 C；0-59 D
        if(score >= 90 && score <= 100){
            System.out.println("A");
        } else if(score >= 80 && score <= 89){
            System.out.println("B");
        } else if(score >= 60 && score <= 79){
            System.out.println("C");
        } else if(score >= 0 && score <= 59){
            System.out.println("D");
        } else{
            System.out.println("您输入的成绩不合法！");
        }
    }
}
