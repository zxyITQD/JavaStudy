package method;
// 定义一个方法 打印出来的数组为这种格式 [1,2,3,4,5]
public class Demo6 {
    public static void main(String[] args) {
        // 调用方法
        int[] arr = {2,4,5,6,8};
        int[] arr2 = {4,5,6,8,3};
        printArray(arr);
        printArray(arr2);
    }

    // 定义方法
    // 有参数 无返回值
    public static void printArray(int[] arr){
        // 开头打印 [ 不能换行
        System.out.print("[");

        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // 不是结尾的下标值需要加上逗号和空格
            if(i != arr.length -1){
                System.out.print(", ");
            }
        }
        // 结尾打印 ]
        System.out.println("]");
    }
}
