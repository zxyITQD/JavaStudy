package com.xiaoyan.study;

/**
 * 截取数组
 */
public class SubArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 6, 9, 8};
        int[] newArr = cutArray(arr, 2, 4);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    /**
     * 定义截取数组的方法
     */
    public static int[] cutArray(int[] arr, int fromIndex, int len) {
        if (fromIndex < 0 || len < 0) {
            return null;
        }
        if ((len + fromIndex) > arr.length) {
            return null;
        }
        int[] newArr = new int[len];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[fromIndex];
            fromIndex++;
        }
        return newArr;
    }
}
