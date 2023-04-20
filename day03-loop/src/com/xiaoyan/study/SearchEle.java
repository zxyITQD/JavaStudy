package com.xiaoyan.study;

public class SearchEle {
    public static void main(String[] args) {
        int[] arr = {3,4,8,2,7,10};
        int index = searchIndex(arr,6);
        System.out.println(index);

    }
    // 定义方法返回指定元素的索引
    public static int searchIndex(int[] arr,int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
