package com.xiaoyan.study;

import java.util.concurrent.locks.ReentrantLock;

public class Sell implements Runnable {
    private int ticket = 100;
    ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){

            // 因为两个线程是异步的， 这个if判断可能不会被其他线程重新走 导致ticket可能为0(可见性)
            // 解决办法
            // 当多个线程共用资源时 应保证线程同步访问共享资源代码块
            // jdk5 有一个lock接口的实现类Reentrantlock类的API可以进行上锁
            lock.lock();
//            synchronized (Sell.class) {
            try {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售卖第" + ticket + "张票");
                ticket--; //不是原子操作 原子操作就是一件事要么同时成功或者同时失败
                // 两个线程争夺CPU时间片 ticket这个共享资源可能不变(原子性)
            } finally {
                lock.unlock();
            }
//            }

        }

    }
}
