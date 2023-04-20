package array;

import java.util.Random;

/*
对以下奖金进行多轮抽奖 [300,500,800,1000,1500] 抽的奖金不能重复
 */
public class Demo11 {
    public static void main(String[] args) {
        int[] arr = {300, 500, 800, 1000, 1500};
        draw(arr);
    }

    // 定义方法
    public static void draw(int[] arr) {
        // 随机对象
        Random rd = new Random();
        // 定义抽到奖的次数
        int count = 0;
        // 开始抽奖 count大于奖池范围 抽奖停止
        while (count < arr.length) {
            int index = rd.nextInt(arr.length);
            if (arr[index] == 0) {
                continue;
            }
            System.out.println("第" + (count + 1) + "次抽到的奖金为：" + arr[index]);
            arr[index] = 0;
            count++;
        }
    }
}
