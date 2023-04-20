package method;
/*
定义方法实现，获取数组的一部分，
需要的参数是：一个数组，一个开始索引 off，一个长度 len，
实现的目标是从该索引off位置获取，一共获取len个元素，组成一个新数组
 */

// 有参数有返回值
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 8, 4, 9};
        int off = 1;
        int len = 4;
        int[] newArray = getNewArr(arr, off, len);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }

    public static int[] getNewArr(int[] arr, int off, int len) {
        // 定义新数组
        int[] newArr = new int[len];
        // 定义新数组的下标
        int index = 0;
        for (int i = off; i < len + off; i++) {
            // index参与赋值 先使用后自增
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }

}
