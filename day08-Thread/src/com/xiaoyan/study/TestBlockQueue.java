package com.xiaoyan.study;

import java.rmi.MarshalledObject;
import java.util.concurrent.ArrayBlockingQueue;

public class TestBlockQueue {
    public static void main(String[] args) {
        // 阻塞队列实例化必须指明容量
        ArrayBlockingQueue<Object> a = new ArrayBlockingQueue<>(1);
        new Thread(new Producer(a)).start();
        new Thread(new Consumer(a)).start();

    }
}
