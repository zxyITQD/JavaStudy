package com.xiaoyan.study;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUploadClient {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("C:\\Users\\User\\Pictures\\Saved Pictures\\微信图片_20230327220441.jpg");
        Socket s = new Socket(InetAddress.getByName("192.168.62.218"),9527);
        OutputStream out = s.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        /**
         * 读取
         */
        while ((len = fi.read(bytes)) != -1){
            out.write(bytes,0,len);
        }
        /**
         * 告诉服务端上传完毕
         */
        s.shutdownOutput();
        /**
         * 得到服务端反馈
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String result = br.readLine();
        System.out.println("服务端反馈了："+result);
        fi.close();
        br.close();
        s.close();
    }
}
