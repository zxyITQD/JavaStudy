import java.util.Scanner;
// 判断键盘输入的年数是否为闰年
// 闰年能被4整除 不能被100整除 能被400整除
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = in.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("您输入的年份为闰年");
        } else {
            System.out.println("您输入的年份为平年");
        }
    }
}
