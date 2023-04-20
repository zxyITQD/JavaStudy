package array;

/**
 * 冒泡排序 两两比较 大的数放到后面
 */

public class Demo9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 7, 9};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // 定义方法
    public static void bubbleSort(int[] arr) {
        // 外循环控制比较轮数 轮数为数组长度-1
        for (int i = 0; i < arr.length - 1; i++) {
            // 内循环控制比较过程 范围需要数组长度-1 避免越界 每论排完需要减去已经排好的
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
