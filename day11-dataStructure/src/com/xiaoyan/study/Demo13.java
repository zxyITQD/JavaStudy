package com.xiaoyan.study;

import java.util.Arrays;

/**
 * 插入排序 当前元素插入前面已经排好序合适的位置
 */
public class Demo13 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 2, 6, 15, 8, 20};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {

        /*外循环控制轮数 第一个位置已经排好*/
        for (int i = 1; i < arr.length; i++) {
            /*内循环遍历当前元素前面的元素*/
            for (int j = i - 1; j >= 0; j--) {
                /*如果前一个元素比后一个元素大就交换位置*/
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    /*如果不大说明找到了位置 退出循环 */
                } else {
                    break;
                }
            }
        }
    }
}
