package StringBuilder;

// 将整数数组中的元素按照格式拼成一个字符串
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 7};
        System.out.println(StringBuilderToString(arr));

    }

    // 定义方法 这种格式 [2,4,6,7,8]
    public static String StringBuilderToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return String.valueOf(sb);
    }
}
