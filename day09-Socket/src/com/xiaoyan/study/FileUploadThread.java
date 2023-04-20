package com.xiaoyan.study;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * 文件上传服务端 实现多线程 保证同时上传多个图片
 */
public class FileUploadThread implements Runnable {
    /**
     * 构造FileUploadThread对象时把socket对象作为参数传递
     */
    private Socket socket;

    public FileUploadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        FileOutputStream fs = null;
        try {

            /**
             * 把数据读取到本地
             */
            InputStream in = socket.getInputStream();
            /**
             * 随机生成图片id 客户端发来的图片能存入多个
             */
            String ranstar = UUID.randomUUID().toString().replaceAll("-", "");
            fs = new FileOutputStream("day09-Socket\\" + ranstar + ".jpg");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = in.read(bytes)) != -1) {
                fs.write(bytes, 0, len);
            }
            System.out.println("文件保存成功");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("文件上传成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /**
             * 关闭字节输出流
             */
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
