package method;
/*
假设某个比赛有6个评委打分，分数范围是（0-10），去掉一个最低分，去掉一个最高分，取平均分作为该选手的最终得分。

 */
import java.util.Scanner;

// 键盘输入6个成绩存储到数组中 超出分数范围重新输入
// 分别定义一个方法 求和，求最大值，求最小值
// 算出平均分
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第"+ (i+1)+"个成绩");
            int score = sc.nextInt();
            if(score >= 0 && score <= 10){
                arr[i] = score;
            } else {
                System.out.println("格式错误");
                i--;
            }
        }

        // 求和
        int sum = getSum(arr);
        // 最高分
        int max = getMax(arr);
        // 最低分
        int min = getMin(arr);

        // 求平均分
        double average = (sum - max -min) * 1.0 / (arr.length -2);// 整数不能直接转换小数
        System.out.println("平均分为：" + average);
    }

    // 定义求和方法
    public  static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 定义求最大值方法
    public  static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    // 定义求最小值方法
    public  static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
