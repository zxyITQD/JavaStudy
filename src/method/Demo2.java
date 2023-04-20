package method;
/*
1、定义方法实现在数组中查找某个元素第一次出现的索引位置，如果不存在返回-1
 */

// 参数数组 元素 有返回值
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 4, 9};
        int n = 6;
        // 调用方法
        int arrIndex = getArrIndex(arr, n);
        System.out.println(arrIndex);

    }

    // 定义方法
    public static int getArrIndex(int[] arr, int n) {
        int m = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                m = i;
                break;
            }
        }
        return m;

    }
}
