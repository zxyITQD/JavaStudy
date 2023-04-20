/**
 * 第一天要了1块钱
 * 第二天要了2块钱
 * 第三天要了4块钱
 * 第四天要了8块钱
 * 以此类推
 * 问题： 洪乞丐干10天，收入是多少？
 */
public class Test1 {
    public static void main(String[] args) {
        int money = 0;
        for (int i = 0; i < 10; i++) {
            money += Math.pow(2, i);
        }
        System.out.println("收入为" + money);
    }
}
