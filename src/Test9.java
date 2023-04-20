/*
现有如下两个数组，元素如下：
  数组a：{11, 33, 55, 77}
  数组b：{22, 44, 66, 88}
  请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
  即结果为：{11, 33, 55, 77, 22, 44, 66, 88}

 */
public class Test9 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 9};
        int[] arr2 = {5, 9, 3, 10};
        int[] concat = concat(arr, arr2);
        for (int i = 0; i < concat.length; i++) {
            System.out.print(concat[i] + " ");
        }

    }

    // 定义方法
    public static int[] concat(int[] a, int[] b) {
        int len = a.length + b.length;
        int[] c = new int[len];
        int index = a.length;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[index] = b[j];
            index++;
        }
        return c;
    }
}
