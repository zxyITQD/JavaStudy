package com.xiaoyan.study;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 如何在泛型为String的ArrayList集合中添加Integer类型数据？
 */
public class ReflectGenericity {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        /**
         * 通过反射绕过泛型编译期的类型检测
         */
        ArrayList<String> arr = new ArrayList<>();
        arr.add("100");
        /* 字节码文件 */
        Class aClass = arr.getClass();
        /* 获取add方法 */
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(arr, 100);
        /* 遍历集合 */
        for (Object s : arr) {
            boolean isString = s instanceof String;
            System.out.println(s + "是否为String类型" + isString);
        }

    }
}
