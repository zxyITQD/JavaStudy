package array;

// 数组类型 [] 数组名  =  new 数组类型[数组长度]
public class Demo1 {
    public static void main(String[] args) {
        // 定义一个整型数组
        int[] arr = new int[4];// 数组长度为4
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        //动态初始化值
        arr[0] = 3;
        //arr本身是什么
        System.out.println(arr);// [I@1b6d3586 1b6d3586由内存地址计算而来的
    }
}
