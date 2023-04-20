package ObjectClass;

import java.util.Objects;

/*
1、定义Student类，重写equals方法、hashCode方法、toString方法
 */
public class Student {
    private String name;
    private int age;

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
   // 重写equals方法
    @Override
    public boolean equals(Object o) {
        // 如果两个对象的地址值相等 返回true
        if (this == o) return true;
        // 如果被判断对象为null或者两个对象不是同一个类的实例 返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 向下转型
        Student student = (Student) o;
        // 两个对象的基本数据类型的属性相同吗 不同 返回false
        if (age != student.age) return false;
        /*
         本对象的引用数据类型属性为null吗
         如果不是重复以上过程
         如果是 判断第二个对象是否为null 为null 返回true 否则返回false
         */
        return name != null ? name.equals(student.name) : student.name == null;

    }
// 重写hashCode方法 根据属性计算而来 属性相同 哈希值相同  属性不同 尽可能不同
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
// 重写toString方法对应字段拼接成字符串
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
