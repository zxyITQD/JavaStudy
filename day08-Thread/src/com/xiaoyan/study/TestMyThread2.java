package com.xiaoyan.study;

public class TestMyThread2 {
    public static void main(String[] args) {
        MyThread2 m = new MyThread2();
        Thread t = new Thread(m);
        Thread t2 = new Thread(m);
        t.start();
        t2.start();
    }
}
