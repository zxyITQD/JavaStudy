package com.xiaoyan.study;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 定义一个Worker类（属性 姓名name 年龄age 工资salary）
 *     创建几个Worker对象，存入TreeSet集合，
 *     要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；
 *     如果也相同，按照姓名字典顺序排序。
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Worker> t = new TreeSet<>();
        t.add(new Worker("Tom",28,5600.0));
        t.add(new Worker("Jack",25,5500.0));
        t.add(new Worker("Join",26,5600.0));
        t.add(new Worker("Lihua",29,5800.0));
        t.add(new Worker("Mike",29,5800.0));
        Iterator<Worker> iterator = t.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
