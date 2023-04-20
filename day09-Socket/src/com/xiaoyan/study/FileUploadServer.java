package com.xiaoyan.study;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FileUploadServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9527);

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("与客户端连接成功");
            /**
             * 定义线程池开启多线程
             */
            ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                    8,
                    40,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(5),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy());
//        serverSocket.close();
            pool.submit(new FileUploadThread(socket));
        }
    }
}
