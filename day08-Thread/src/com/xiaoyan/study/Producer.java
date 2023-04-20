package com.xiaoyan.study;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 阻塞队列 Queue接口常用的两个实现类
 * ArrayBlockingQueue和LinkedBlockingQueue完成生产者与消费者
 */
public class Producer implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public Producer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                queue.put("产品:" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("目前生产的产品有" + queue.size());
        }
    }
}
