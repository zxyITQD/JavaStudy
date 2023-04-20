package com.xiaoyan.WaitAndNotify;

public class ProducerAndConsumer {
    public static String product = "";

    public static void main(String[] args) {
        Object lock = new Object();
        new ProducerThread(lock).start();
        new ConsumerThread(lock).start();
    }
}
