package com.xiaoyan.study.byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CatchOutputStreamExp {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day07-io\\test2.txt");
            /**
             * 如果fos成功创建 写入数据时出现异常 try后面的代码不再执行 需要关闭流
             */
            fos.write("hello".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            /**
             * finally不管有没有发生异常都会执行 可以用来关闭流 但仍需要捕获异常
             */
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
