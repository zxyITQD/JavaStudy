package com.xiaoyan.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历hashMap
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String,String> h = new HashMap<>();
        h.put("许仙","白娘子");
        h.put("梁山伯","祝英台");
        h.put("我","神里绫华");
        h.put("杨过","小龙女");
        /**
         * 遍历键找到对应的值
         */
        Set<String> strings = h.keySet();
        for (String key : strings) {
            String value = h.get(key);
            System.out.println("键为"+key+",值为"+value);
        }
        System.out.println("--------------");
        /**
         * 遍历键值对
         */
        Set<Map.Entry<String, String>> entries = h.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("键为"+key+",值为"+value);
        }
        System.out.println("-----------");
        /**
         * forEach遍历
         */
        h.forEach((k,v) ->  System.out.println("键为"+k+",值为"+v));
    }
}
