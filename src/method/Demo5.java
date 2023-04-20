package method;

/*
现获取到如下数组
  {1, 2, 0, 3, 4, 0, 0, 5};
  现在需要将其中的数据0，都放到数组的最后面，得到如下的结果：
  {1, 2, 3, 4, 5, 0, 0, 0}
  请编写程序，实现上述效果。不要改变元素的相对位置，无需排序
 */
// 定义方法
// 参数为数组 返回一个新数组
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 0, 0, 5};
        int[] newArr = lianxiArr(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    // 定义方法
    public static int[] lianxiArr(int[] arr) {
        int[] newArr = new int[arr.length];
//        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[index++] = arr[i];
            }
        }

        return newArr;
    }
}
