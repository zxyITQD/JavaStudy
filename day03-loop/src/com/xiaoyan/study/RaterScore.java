package com.xiaoyan.study;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/*
评委打分案例（求最值 求和）
 */
public class RaterScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入分数：");
            int score = s.nextInt();
            arr[i] = score;
            if (score <= 0 && score > 10) {
                System.out.println("格式不对，重新输入");
                i--;
            }
        }
        int max = arr[0];
        int min = arr[0];
        int total = 0;
        for (int j = 0; j < arr.length; j++) {
            total += arr[j];
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        // 去掉最高分，最低分平均分为
        double avg = (total - max - min) * 1.0;
        BigDecimal big = new BigDecimal(String.valueOf(avg));
        BigDecimal big2 = new BigDecimal(String.valueOf(3));
        BigDecimal divide = big.divide(big2, 2, RoundingMode.HALF_UP);
        double averge = divide.doubleValue();
        System.out.println("平均分为：" + averge);
    }
}
