package com.xiaoyan.study;
/*
遍历二维数组
销售额 求季度销售额 年度销售额
34 23 34
23 12 32
12 67 34
23 56 2
 */
public class ValueSale {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{34, 23, 34}, {23, 12, 32}, {12, 67, 34}, {23, 56, 2}};
        // 定义年度销售额
        int total = 0;
        // 外循环遍历小数组
        for (int i = 0; i < arr.length; i++) {
            int season = 0;
            System.out.println("第" + (i + 1) + "年的销售额为：");
            //内循环遍历小数组的每一项
            for (int j = 0; j < arr[i].length; j++) {
                season += arr[i][j];
            }
            // 每一个小数组元素的和
            System.out.println(season);
            total += season;

        }
        System.out.println("年度销售额为：" + total);
    }
}
