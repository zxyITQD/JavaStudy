package Regex;

import java.util.Arrays;

// 正则表达式的拆分
//  使用指定的正则表达式将此字符串拆分，返回拆分后得到的字符串数组
// 分割字符不在结尾 除分割字符外匹配字符会变成字符串存在数组中
//    注意：结尾的空字符串不包含在结果数组中。
public class Demo5 {
    public static void main(String[] args) {
        String s = "bb:cc:dd";
        String[] arr = s.split(":");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));// [bb, cc, dd]
        String s2 = "boo:adofoo";
        String[] arr2 = s2.split("o");
        System.out.println(Arrays.toString(arr2));// [b, , :ad, f]
        String str = "11 22   33  44     55";
        String[] arr3 = str.split("\\s+");
        System.out.println(Arrays.toString(arr3));// [11, 22, 33, 44, 55]
    }
}
