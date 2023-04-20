package com.xiaoyan.study;
/**
 * 定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("ab");
        a.add("cd");
        a.add("ffg");
        a.add("xhgg");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
