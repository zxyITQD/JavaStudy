package com.xiaoyan.study;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i <50 ; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
