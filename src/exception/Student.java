package exception;

public class Student extends AgeOutRoundsException {

    private String name;
    private int age;

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
        // 定义异常条件 提供发生异常信息
        if (age < 18 || age > 40) {
            throw new AgeOutRoundsException("age must between 18 and 40");
        } else{
            this.age = age;
        }

    }
    // 重写toString 以便打印age

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
