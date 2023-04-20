package com.xiaoyan.study.charStream;

import java.io.Serializable;

public class Student implements Serializable {
    // 定义永久版本序列号
    private static final long serialVersionUID = 123L;
    private String name;
    private int age;
    private String h;
    private int df;

 public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
