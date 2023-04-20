package com.xiaoyan.study.charStream;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        FileReader fi = new FileReader("D:\\javakaifa\\project3\\day07-io\\src\\com\\xiaoyan\\study\\charStream\\p.properties");
//        FileOutputStream fo = new FileOutputStream("p.properties");
        Properties p = new Properties();
        p.load(fi);
        fi.close();
        p.forEach((k, v) -> System.out.println(k + "=" + v));
        FileWriter fw = new FileWriter("D:\\javakaifa\\project3\\day07-io\\src\\com\\xiaoyan\\study\\charStream\\p.properties");
        p.put("许仙","白娘子");
        p.put("我","爱敲代码");
        System.out.println("-------");
        p.forEach((k,v) -> System.out.println(k+"="+v));
        p.store(fw,"这是一个学习properties的配置");
        fw.close();
    }
}
