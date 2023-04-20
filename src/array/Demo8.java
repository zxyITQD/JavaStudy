package array;
// 二分查找

public class Demo8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 7, 10};
        int key = 20;
        int index = binarySearch(arr, key);
        System.out.println(index);
    }

    // 定义方法
    public static int binarySearch(int[] arr, int key) {
        // 定义两个指针 规定查找范围 找出中间位置
        // 头指针
        int start = 0;
        // 尾指针
        int end = arr.length - 1;

        // 循环次数不确定 使用while循环 当头指针不大于尾指针开始循环
        while (start <= end) {
            // 中间位置
            int mid = (start + end) / 2;
            // 如果key大于中间位置 头指针右移
            if (key > arr[mid]) {
                start = mid + 1;
                // 如果key小于中间位置 尾指针左移
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                // 找到了 把数据返回 方法结束
                return mid;
            }
        }
        // 头指针大于尾指针结束循环 如果方法还没有返回值 说明没有找到 返回-1
        return -1;
    }
}
