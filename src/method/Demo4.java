package method;
// 定义方法实现，数组的反转，要在原数组上完成
// 参数数组 没有返回值
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,9};
        reverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // 定义方法
    public  static void reverseArr(int[] arr){
        // 头指针
        int start = 0;
        // 尾指针
        int end = arr.length -1;
        while (start < end){
            int temp = 0;
            if (start < end) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
