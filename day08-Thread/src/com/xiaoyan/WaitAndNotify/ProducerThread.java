package com.xiaoyan.WaitAndNotify;

/**
 * 生产者线程 等待唤醒机制
 */
public class ProducerThread extends Thread {
    private Object lock;

    public ProducerThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                /*如果有产品就等待*/
                if (!"".equals(ProducerAndConsumer.product)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*没有产品 生产产品*/
                ProducerAndConsumer.product = System.currentTimeMillis() + "";
                System.out.println(Thread.currentThread().getName()+"生产了--"+ProducerAndConsumer.product);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*生产完产品 唤醒消费者消费*/
                lock.notifyAll();
            }
        }
    }
}
