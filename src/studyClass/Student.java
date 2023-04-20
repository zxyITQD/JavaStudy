package studyClass;

public class Student {
    // 成员变量
    private String name;
    // 私有成员变量 只能在本类使用
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // this 用来解决成员变量与局部变量重名问题
        if (age >= 0 && age <= 200) {
            // this指的是调用方法的那个类对象即实例对象
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void study() {
        System.out.println("学习使我快乐");
    }

    public void eat() {
        System.out.println("干饭人，干饭魂");
    }
}
