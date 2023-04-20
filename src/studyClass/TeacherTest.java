package studyClass;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("张三");
        t.setAge(36);
        System.out.println(t.getName() + "是" + t.getAge() + "岁");
    }
}
