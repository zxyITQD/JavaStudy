package com.xiaoyan.study.byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream fs = new FileInputStream("C:\\Users\\User\\Pictures\\Saved Pictures\\drawable-xxhdpi\\图层1.png");
             FileOutputStream fso = new FileOutputStream("day07-io\\test.png")) {
            byte[] b = new byte[8192];
            int len;
            while ((len = fs.read(b))!= -1){
                fso.write(b,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
