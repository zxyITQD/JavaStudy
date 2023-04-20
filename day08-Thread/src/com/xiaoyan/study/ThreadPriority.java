package com.xiaoyan.study;

public class ThreadPriority {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "正在执行" + i);
            }
        });
        t.setPriority(1);
        t.start();
        System.out.println(t.getPriority());

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "正在执行" + i);
            }
        });
        t2.join();
        t2.start();

        for (int i = 0; i < 100; i++) {
            Thread.sleep(200);
            System.out.println(Thread.currentThread().getName() + "正在执行" + i);
        }



    }
}
