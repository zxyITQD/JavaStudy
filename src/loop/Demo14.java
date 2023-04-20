package loop;

import java.util.Arrays;

/**
 * 把两个有序数组 合成一个新的有序数组
 */
public class Demo14 {
    public static void main(String[] args) {
        int[] arr = {22, 44, 66, 88};
        int[] arr2 = {11, 33, 55, 77, 99,100};
        int[] newArr = getNewArray(arr, arr2);
        System.out.println(Arrays.toString(newArr));
    }

    /**
     * 定义方法
     */
    public static int[] getNewArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int n1 = 0, n2 = 0, n3 = 0;
        while (n1 < a.length && n2 < b.length) {
            c[n3++] = a[n1] < b[n2] ? a[n1++] : b[n2++];
        }
        /**
         * 当达到其中一个数组的最大索引后 循环就会停止
         * 如果两个数组长短不一 就会出现长的数组元素没有完全放进新数组中
         * 多出的元素必定是最大的
         */
        while (n1 < a.length){
            /**
             * 如果a为长数组 n1还没有超出索引 进入循环
             */
            c[n3++] = a[n1++];
        }
        while (n2 < b.length){
            /**
             * 如果b为长数组 n2还没有超出索引 进入循环
             */
            c[n3++] = b[n2++];
        }
        return c;
    }
}
