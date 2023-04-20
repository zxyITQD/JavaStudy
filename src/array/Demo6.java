package array;
// 二维数组
public class Demo6 {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        int[] arr2 = {3,5,6};
        arr[0] = arr2;
        System.out.println(arr[0][2]);
    }
}
