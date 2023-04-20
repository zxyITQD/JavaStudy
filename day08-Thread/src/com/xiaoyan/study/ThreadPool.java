package com.xiaoyan.study;

import java.util.concurrent.*;

/**
 * 线程池的标准创建模式
 */
public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                2,
                4,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 8; i++) {
            /**
             * 提交10个线程
             */
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"正在执行");
            });
        }
        pool.shutdown();
    }
}
