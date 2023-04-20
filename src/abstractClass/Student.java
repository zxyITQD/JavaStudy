package abstractClass;
// 继承抽象类 本身必须重写父类的所有方法
public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

}
