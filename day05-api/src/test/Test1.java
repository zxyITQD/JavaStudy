package test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for(int j = 0;j< arr.length;j++){
            System.out.println(arr[j]);
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println(max);


    }
}
