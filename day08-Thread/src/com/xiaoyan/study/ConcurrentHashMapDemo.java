package com.xiaoyan.study;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * stringBuffer, vector, hashtable线程安全的类但效率不高
 * HashMap效率高但线程不安全  线程安全并且效率高的concurrentHashMap
 */
public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
/**
 * HashMap有时是不安全的
 */
        /*HashMap<String,String> ha = new HashMap<>();*/
        ConcurrentHashMap<String,String> ha = new ConcurrentHashMap<>();
        new Thread(() ->{
            for (int i = 1; i <= 10; i++) {
                    ha.put(String.valueOf(i),String.valueOf(i));
            }
        }).start();
        new Thread(() ->{
            for (int j = 11; j <= 20; j++) {
                ha.put(String.valueOf(j),String.valueOf(j));
            }
        }).start();
        for (int i = 1; i <= 20; i++) {
            System.out.println(ha.get(i+""));
        }
    }
}
