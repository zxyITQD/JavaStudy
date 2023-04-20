package com.xiaoyan.study;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.setName("分支线程1");
        my.start();
//        System.out.println(my.getName());
//        System.out.println("------------------");
        System.out.println(Thread.currentThread().getName());
        MyThread my2 = new MyThread();
        my2.setName("分支线程2");
//        System.out.println(my2.getName());
        my2.start();
    }
}
