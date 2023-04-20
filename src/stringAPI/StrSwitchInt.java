package stringAPI;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
"12 56 34 112 23 66 11 18 35" -- 把其中的数据按照从小到大的顺序排列 组成一个新的字符串
字符串与整数之间的互换
 */
/*
用空格分割成字符串数组
把字符串数组转换为整型数组 排列顺序 把数组转换成字符串
 */
public class StrSwitchInt {
    public static void main(String[] args) {
        String str = "12 56 34 112 23 66 11 18 35";
        System.out.println(strSort(str));
    }

    // 定义方法
    public static String strSort(String s) {
        // 空格分割成字符串数组
        String[] s2 = s.split(" ");
        int[] arr = new int[s2.length];
        for (int i = 0; i < arr.length; i++) {
            // 把字符串数组转为整型数组
//            Integer it = Integer.valueOf(s2[i]);
//            arr[i] = it.intValue();
            arr[i] = Integer.parseInt(s2[i]);
        }
        // 排序
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
