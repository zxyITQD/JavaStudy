package com.xiaoyan.study;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP协议 服务端
 */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);
        byte[] bytes = new byte[2048];
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length);
        while (true) {
            socket.receive(packet);
            /**
             * 解析
             */
            int len = packet.getLength();
            String str = new String(bytes,0,len);
            String ip = packet.getAddress().getHostAddress();
            System.out.println(ip+"发过来:"+str);
        }
    }
}
