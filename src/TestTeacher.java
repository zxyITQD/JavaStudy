public class TestTeacher {
    public static void main(String[] args) {
        MathTeacher t = new MathTeacher();
        t.teach();
        MathTeacher t2 = new MathTeacher("数学");
        t2.setAge(35);
        t2.setName("张三");
        t2.setPhoneNumber("14523451234");
        t2.showInfo();
    }
}
