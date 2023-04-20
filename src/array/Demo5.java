package array;
// 查找自定数字在数组中第一次出现的索引
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {4,6,5,4,9,2};
        int key = 9;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                // 第一次出现就不再查找
                index = i;
                break;
            }
        }
        if(index < 0){
            System.out.println("不存在");
        } else {
            System.out.println("在索引" + index + "上");
        }
    }
}
