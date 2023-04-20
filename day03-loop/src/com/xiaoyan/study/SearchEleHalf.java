package com.xiaoyan.study;

// 折半查找
public class SearchEleHalf {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10};
        int a = binarySearch(arr, 11);
        System.out.println(a);
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
