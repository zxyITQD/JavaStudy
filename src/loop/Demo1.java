package loop;

public class Demo1 {
    public static void main(String[] args) {
        // 求1到30的和
        // 定义一个变量存储和的值
        int sum = 0;
        for (int i = 1;i <= 30;i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
