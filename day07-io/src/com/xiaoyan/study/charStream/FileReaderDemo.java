package com.xiaoyan.study.charStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("day07-io\\test2.txt",true);
            fr = new FileReader("day07-io\\test2.txt");
            char[] c = new char[]{'你', '好', '呀', '！'};
            fw.write("hello world");
            fw.write(c);

            char[] d = new char[1024];
            int len;
            while ((len = fr.read(d)) != -1) {
                System.out.println(new String(d, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null || fr != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
