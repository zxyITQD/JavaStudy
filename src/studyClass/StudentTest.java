package studyClass;

public class StudentTest {
    public static void main(String[] args) {
        // 测试student类
        Student s = new Student();
        s.setName("张三");
        s.setAge(15);
        System.out.println(s.getName() + "是" + s.getAge() + "岁");
        s.study();
        System.out.println(s.getName() + "饿了");
        s.eat();
    }
}
