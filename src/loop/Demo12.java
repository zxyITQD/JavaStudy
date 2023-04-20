package loop;

/*
1 2 3 4 四个数据，从中选择3个数字 组成一个三位数，要求选择的数字不重复。这样的三位数有多少个？
    三层循环
    百位4种选择
    十位3种选择
    个位2种选择
 */
public class Demo12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int b = arr[j];
                for (int k = 0; k < arr.length; k++) {
                    int c = arr[k];
                    if (a != b && a != c && b != c){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
