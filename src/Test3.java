import java.util.Scanner;
// 小明爸爸根据小明的考试分数给予相应的奖励
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = in.nextInt();
        if(score >= 0 && score <= 59){
            System.out.println("抽出七匹狼");
        } else if(score >= 60 && score <= 79){
            System.out.println("赠送变形金刚");
        } else if(score >= 80 && score <= 100){
            System.out.println("原神抽卡一个五星角色");
        } else {
            System.out.println("请正确输入分数");
        }

    }
}
