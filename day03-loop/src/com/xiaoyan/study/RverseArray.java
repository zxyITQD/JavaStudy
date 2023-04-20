package com.xiaoyan.study;

public class RverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        String arrStr = printArray(arr);
        String newArr = printArray(rverseArr(arr));
        System.out.println("旧数组为：" + arrStr + "\n"+"反转后为：" + newArr);
    }

    // 定义反转数组的方法
    public static int[] rverseArr(int[] arr) {
        // 定义头指针
        int start = 0;
        // 定义尾指针
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // 定义打印数组的方法
    public static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
