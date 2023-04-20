package com.xiaoyan.study;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * String s = "11 110   20  25  18  17  15  22"
 *     将其中的整数按照大小排序（Arrays.sort()）,组成一个新的字符串。
 *     拆分成字符串数组
 *     字符串数组转换为整数数组
 *     排序
 *     再把整数数组拼接成字符串（StringBuilder）
 */
public class Demo11 {
    public static void main(String[] args) {
        String s = "11 110   20  25  18  17  15  22";
        String[] strArr = s.split("\\s+");
//        System.out.println(Arrays.toString(strArr));
        int[] arr = new int[strArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(arr);
        StringBuilder ab = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            ab.append(arr[j]);
            if(j < arr.length -1){
                ab.append(" ");
            }
        }
        String newStr = ab.toString();
        System.out.println(newStr);
    }
}
