package com.xiaoyan.study;

import java.util.HashMap;

/**
 * 练习Map接口
 */
public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Tom", "猫");
        hm.put("Jary", "鼠");
        hm.put("Bob", "狗");
        hm.forEach((k, v) -> System.out.println("键为" + k + "值为" + v));
        hm.remove("Tom");
        System.out.println("-----------------");
        hm.forEach((k, v) -> System.out.println("键为" + k + "值为" + v));
        System.out.println(hm.size());
    }
}
