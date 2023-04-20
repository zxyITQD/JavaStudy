package com.xiaoyan.study;

/**
 * 反射机制 获取类的字节码文件 从而获取类的所有shux和方法
 */
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 类加载时获取
         */
        Class<Student> aClass = (Class<Student>)Class.forName("com.xiaoyan.study.Student");
        System.out.println(aClass);
        /**
         * 类编译成字节码文件时
         */
        Class<Student> aClass1 = Student.class;
        System.out.println(aClass1);
        /**
         * 类运行时
         */
        Student s = new Student("张三",18);
        Class<Student> aClass2 = (Class<Student>) s.getClass();
        System.out.println(aClass2);
    }
}
