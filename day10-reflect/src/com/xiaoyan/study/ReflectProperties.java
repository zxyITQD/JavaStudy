package com.xiaoyan.study;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 读取配置文件 通过反射解耦
 */
public class ReflectProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");
        /*读取文件*/
        Properties p = new Properties();
        p.load(resourceAsStream);
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        /*String name = p.getProperty("name");*/
        Class aClass =  Class.forName(className);
        Constructor constructor = aClass.getConstructor();
        Object s = constructor.newInstance();
        Method method = aClass.getMethod(methodName, String.class);
        method.invoke(s,"王五");
    }
}
