package com.xiaoyan.study.charStream;

import java.io.*;

public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day07-io\\test3.txt",true));
        bw.write("hello world");
        bw.newLine();
        bw.write("中国");
        bw.close();
        BufferedReader br =new BufferedReader(new FileReader("day07-io\\test3.txt"));
//        char[] c = new char[8192];
//        int len;
//        while ((len = br.read(c)) != -1){
//            System.out.println(new String(c,0,len));
//        }
//        br.close();
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
