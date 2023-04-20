package com.xiaoyan.study;

/**
 * 定义一个Worker类（属性 姓名name 年龄age 工资salary）
 *     创建几个Worker对象，存入TreeSet集合，
 *     要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；
 *     如果也相同，按照姓名字典顺序排序。
 */
public class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        int result;
        /**
         * 主要条件
         */
         if(this.salary > o.salary){
             result = -1;
         }else if(this.salary < o.salary){
             result = 1;
         }else{
             /**
              * 次要条件
              */
             result = this.age - o.age;
         }

        /**
         * 次要条件
         */
        result = result==0 ? this.name.compareTo(o.name) : result;
        return result;
    }
}
