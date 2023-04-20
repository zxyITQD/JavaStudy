package com.xiaoyan.study.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fsi = new FileInputStream("day07-io\\test.txt");

//        for (int i = 0; i <3 ; i++) {
//            int read = fsi.read();
//            System.out.println((char)read);
//        }
        int b;
        while ((b = fsi.read())!= -1){
            System.out.println((char)b);
        }

        fsi.close();

    }
}
