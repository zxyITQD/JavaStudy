package com.xiaoyan.study;

import java.util.HashMap;

/**
 * "java world java javase big big data data data java hello world hello"
 * 都是用空格分隔的  统计每个单词出现的次数。
 */
public class HashMapDemo3 {
    public static void main(String[] args) {
        String s = "java world java javase big big data data data java hello world hello";
        String[] str = s.split("\\s+");
        HashMap<String, Integer> m = new HashMap<>();
        for (String s1 : str) {
            m.put(s1, m.containsKey(s1) ? m.get(s1) + 1 : 1);
        }
        m.forEach((k,v) -> System.out.println("单词" + k + "出现了" + v + "次"));
    }
}