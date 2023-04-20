package com.xiaoyan.study;

import java.util.LinkedList;

/**
 * 2、LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 1; i < 109; i++) {
            l.add(i);
        }
        while (l.size() > 1) {
            l.removeFirst();
            l.addLast(l.removeFirst());
        }
        for (Integer integer : l) {
            System.out.println(integer);
        }
    }
}
