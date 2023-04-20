package com.xiaoyan.study.byteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs = new FileOutputStream("day07-io\\test.txt",true);
        byte[] b = new byte[]{97,98,99};
        fs.write(b);
        fs.write("\r\n".getBytes());
        fs.write(b,0,2);
        fs.close();
    }
}
