package com.xiaoyan.study;

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("张三",18);
        Student s2 = new Student();
        Student s3 = new Student("李四",18);
        s2.setAge(18);
        s2.setName("张三");
        System.out.println(s.equals(s2));
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.equals(s2));
        System.out.println(s3.hashCode());
    }
}
