package com.xiaoyan.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP协议 服务端
 */
public class Demo4server {
    public static void main(String[] args) throws Exception {
        int port = 9527;
        /**
         * 开启服务
         */
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");
        /**
         * 接收数据
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        byte[] bytes = new byte[4096];
        String s = br.readLine();
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println(ip + "发过来了：" + s);
    }
}
