package com.xiaoyan.study;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestMyThread3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread3 m = new MyThread3();
        FutureTask f = new FutureTask(m);
        Thread t = new Thread(f);
        FutureTask f2 = new FutureTask(m);
        Thread t2 = new Thread(f2);
        t.start();
        t2.start();
        Object o = f.get();
        System.out.println(o);
    }
}
