package com.xiaoyan.study;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 3、HashSet 存储几个学生对象，要求如果对象的所有属性都相同就认为是重复。并遍历结果。
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<StudentHashSet> ha = new HashSet<>();
        ha.add(new StudentHashSet("张三",15));
        ha.add(new StudentHashSet("李四",18));
        ha.add(new StudentHashSet("王二",18));
        ha.add(new StudentHashSet("麻子",17));
        ha.add(new StudentHashSet("张三",15));
        Iterator<StudentHashSet> iterator = ha.iterator();
        /**
         * HashSet存对象时 先判断有没有这个元素 如果没有就存，如果有
         * 先比较他们的hashCode值 不同就存
         * hashCode相同 用equals比较他们的属性，不同就存，相同就不存
         * 也就是要重写studentHashSet中的hashCode和equals方法
         */
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
