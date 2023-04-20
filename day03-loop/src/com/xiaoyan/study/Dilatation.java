package com.xiaoyan.study;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
java语言中，数组是长度固定的，即数组一旦初始化，该数组的长度就固定不变了。
那么如果有更多的元素要存入数组，就需要定义新的数组来实现。
现有如下数组：
int[] arr = {11, 22, 33, 44, 55};
a、请通过键盘再录入一个整数，将其存储到已有元素的尾部，并遍历数组打印所有的元素。
b、观察发现，原数组中的元素是按照升序排序的，请重新实现上述第一问中的需求，
保证元素应添加到合适的位置，使得数组中的数据仍然保持升序。
 */
public class Dilatation {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数：");
        int key = sc.nextInt();
        // 第一问
        int[] newArr= newArr(arr,key);
        System.out.println("第一问");
        System.out.println(Arrays.toString(newArr));
        int[] newArr2 = newOrderArr(arr,key);
        System.out.println("第二问");
        // 第二问
        System.out.println(Arrays.toString(newArr2));

    }
    // 第一问
    public static int[] newArr(int[] arr,int key){
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = key;
        return newArray;
    }
    // 第二问
    public static int[] newOrderArr(int[] arr,int key){
        int[] newArray = new int[arr.length+1];
        // 定义指针
        int index = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(key > arr[i]){
                // 如果输入的值大于数组元素 继续往后找
                index++;
                newArray[i] = arr[i];
            }else {
                // 如果小于 index就是新元素的位置 之后的元素放入新数组
                newArray[i+1] = arr[i];
            }
        }
        // 最后把新元素放进新数组
        newArray[index] = key;
        return newArray;
    }
}
