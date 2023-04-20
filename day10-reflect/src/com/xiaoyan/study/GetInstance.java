package com.xiaoyan.study;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class GetInstance {
    public static void main(String[] args) throws Exception {
        /**
         * 字节码对象
         */
        Class<Student> aClass = (Class<Student>) Class.forName("com.xiaoyan.study.Student");
        System.out.println(aClass);
        /**
         * 获取带参公共构造器
         */
        Constructor<Student> constructor = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        /**
         * 实例对象
         */
        Student s1 = constructor.newInstance("张三", 18);
        System.out.println(s1);
        /**
         * 获取带参私有构造
         */
        Constructor<Student> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        /**
         * 实例化私有构造
         */
        declaredConstructor.setAccessible(true);
        Student s2 = declaredConstructor.newInstance("梨花");
        System.out.println(s2);
        /**
         * 获取成员变量
         */
        Constructor<Student> constructor1 = aClass.getConstructor();
        Student s3 = constructor1.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(s3,"王五");
        Object s3name = name.get(s3);
        System.out.println(s3name);
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(s3,28);
        Object s3age = age.get(s3);
        System.out.println(s3age);
        System.out.println(s3);

    }
}
