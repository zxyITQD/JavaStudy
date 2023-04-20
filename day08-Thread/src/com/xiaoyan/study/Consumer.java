package com.xiaoyan.study;

import java.util.concurrent.ArrayBlockingQueue;
/**
 * 阻塞队列 BlockQueue接口常用的两个实现类
 * ArrayBlockingQueue和LinkedBlockingQueue完成生产者与消费者
 */
public class Consumer implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public Consumer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
         while (true){
             Object data = null;
             try {
                 data = queue.take();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("正在消费产品"+"【"+data+"】"+"还剩"+queue.size());
         }
    }
}
