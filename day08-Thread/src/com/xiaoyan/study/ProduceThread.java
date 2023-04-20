package com.xiaoyan.study;

/**
 * 生产者-消费者问题是线程中一个经典的场景。生产者-消费者问题通俗的定义就是：
 * 在指定容量的容器中，同时存在两种对象对容器进行生产或者消费的动作，由于容器的容量有限，
 * 使得"生产"不能太多（容器装不下），“消费”不能无限（容器中不一定含有那么多消费量）。
 * 等待唤醒机制实现
 */
public class ProduceThread extends Thread{
    /**
     * 生产者线程
     */
    private Object lock;

    public ProduceThread(Object lock) {
        this.lock = lock;
    }
    /**
     * 不断生产
     */

}
