package array;

// 求数组最值
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {2, 45, 78, 456, 74, 57};
        // 找最大值
        // 先用一个作为参照
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // 遍历数组与max进行比较，较大值赋予max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
