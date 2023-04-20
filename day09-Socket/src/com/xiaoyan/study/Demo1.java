package com.xiaoyan.study;

import java.io.IOException;
import java.net.*;
import java.util.Random;

/**
 * UDP协议 发送端
 *  public DatagramPacket(byte buf[], int length,
 *                           InetAddress address, int port) {
 *         this(buf, 0, length, address, port);
 *     }
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        int count = 25;
        while (count<0) {
            String data = "Oh! GG霸 童话里做英雄 Oh! GG霸";
            byte[] bytes = data.getBytes();
            Random r = new Random();
            int num = r.nextInt(299)+1;
            String ip = "192.168.62." + num;
            InetAddress address = InetAddress.getByName("255.255.255");
            int port  = 10086;
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,address,port);
            socket.send(packet);
            count--;
        }
        socket.close();
    }
}
