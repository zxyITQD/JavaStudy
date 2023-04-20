package com.xiaoyan.WaitAndNotify;

/**
 * 消费者线程 等待唤醒机制
 */
public class ConsumerThread extends Thread{
    private Object lock;

    public ConsumerThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run(){
        /*不断消费产品*/
        while (true){
            /*同步代码块*/
            synchronized(lock){
                /*如果没有生产出产品就等待*/
                if("".equals(ProducerAndConsumer.product)){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                /*生产出产品就消费*/
                System.out.println(Thread.currentThread().getName()+"消费了--"+ProducerAndConsumer.product);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*消费完了唤醒生产者*/
                lock.notifyAll();
            }
        }
    }
}
