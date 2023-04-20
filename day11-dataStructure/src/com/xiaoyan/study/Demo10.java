package com.xiaoyan.study;

/**
 * 选择排序 每次寻找最小的数放到前面
 */
public class Demo10 {
    public static void main(String[] args) {
        int[] arr = {3,8,4,1,8,4,6,9};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 定义方法
    public static void selectionSort(int[] arr){
        // 外循环控制比较轮数 轮数length -1
        for (int i = 0; i < arr.length -1; i++) {
            // 每轮记录比较的第一个数
            int mark = i;
            // 比较的第二个数 从i+1 开始遍历
            for (int j = i+1; j < arr.length; j++) {
                // 比较两个数获取较小值的下标
                if(arr[j] < arr[mark]){
                    mark = j;
                }
            }
            // 循环结束获取每轮最小值的下标
            // 只有两个数的位置不同才进行替换
            if(mark != i){
                int temp = arr[mark];
                arr[mark] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
