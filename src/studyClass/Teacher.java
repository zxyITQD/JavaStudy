package studyClass;

public class Teacher {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 200){
            this.age = age;
        } else {
            System.out.println("不合法！");
        }
    }
    public int getAge(){
        return this.age;
    }
}
