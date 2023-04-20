package com.xiaoyan.study.charStream;

import java.io.*;

public class ObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    /**
     * 定义对象序列化流
     */
    public static void write() throws IOException {
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("day07-io\\test4.txt"));
        Student s = new Student("张三", 17);
        oo.writeObject(s);
        oo.close();
    }

    /**
     * 定义对象反序列化流
     */
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("day07-io\\test4.txt"));
        Object o = oi.readObject();
        Student st = (Student) o;
        System.out.println(st);
        oi.close();
    }
}
