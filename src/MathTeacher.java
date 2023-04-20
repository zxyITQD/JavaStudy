public class MathTeacher extends Teacher {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public MathTeacher(String subject) {
        this.subject = subject;
    }

    public MathTeacher(String name, int age, String phoneNumber, String subject) {
        super(name, age, phoneNumber);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public MathTeacher() {
    }

    public MathTeacher(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }

    @Override
    public void teach() {
        System.out.println("我是教数学的");
    }
}
