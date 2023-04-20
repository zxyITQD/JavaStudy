package array;

public class Demo2 {
    public static void main(String[] args) {
        // 静态初始化
        int[] arr = new int[]{1,3,6,4,8};
        // 简写
        int[] arr2 = {3,8,2,5,4};
        System.out.println(arr.length);
        System.out.println(arr == arr2);// false
        System.out.println(arr);// [I@1b6d3586
        System.out.println(arr2);// [I@4554617c
    }
}
