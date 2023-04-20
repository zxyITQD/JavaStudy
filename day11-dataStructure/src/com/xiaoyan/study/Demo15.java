package com.xiaoyan.study;

import java.util.Arrays;

/**
 * 归并：合并已排序的数组
 */
public class Demo15 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 9, 10, 2, 7};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] array) {
        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int[] tempArray, int left, int right) {

        if (left < right) {
            // 寻找中间位置
            int center = (left + right) / 2;
            // 两边分别递归
            mergeSort(array, tempArray, left, center);
            mergeSort(array, tempArray, center + 1, right);
            // 合并
            // 左边数组的起始位置left，结束位置center
            // 右边数组的起始位置center + 1，结束位置right
            int leftPos = left;
            int leftEnd = center;
            int rightPos = center + 1;
            int rightEnd = right;

            // 本次合并的元素个数
            int numElements = rightEnd - leftPos + 1;

            // 存入临时数组的起始位置left
            int tempPos = left;
            // 合并两个升序的数组
            while (leftPos <= leftEnd && rightPos <= rightEnd) {
                if (array[leftPos] <= array[rightPos]) {
                    tempArray[tempPos++] = array[leftPos++];
                } else {
                    tempArray[tempPos++] = array[rightPos++];
                }
            }
            // 如果左边没拷贝完
            while (leftPos <= leftEnd) {
                tempArray[tempPos++] = array[leftPos++];
            }
            // 如果右边没拷贝完
            while (rightPos <= rightEnd) {
                tempArray[tempPos++] = array[rightPos++];
            }
            // 将临时空间的数据拷贝到原数组
            for (int i = 0; i < numElements; i++, rightEnd--) {
                array[rightEnd] = tempArray[rightEnd];
            }
        }
    }
}
