package com.xiaoyan.study;

import java.util.Arrays;

/**
 * 快速排序 基准值归位 基准值前面的数都小于它 后面的数都大于它 然后分别递归
 */
public class Demo14 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 10, 8, 3, 5, 9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        /*定义头尾指针 分别指向数组或子数组头尾
        选第一个元素为基准值 头指针向右寻找 找出比基准值大的索引
        尾指针向左寻找找出比基准值小的索引 交换位置
        */
        /*当头尾指针错开时结束*/
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int result = arr[i];
        while (i < j) {
            while (arr[i] <= result && i < j) {
                i++;
            }
            while (arr[j] >= result && i < j) {
                j--;
            }
            /*交换i和j*/

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            /*此时i的位置就是基准值的位置 两者交换*/
            arr[start] = arr[i];
            arr[i] = result;
            /*左子数组 右子数组*/
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }

    }
}
