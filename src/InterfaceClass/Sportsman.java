package InterfaceClass;

public abstract class Sportsman extends Person {
    private int level;

    public Sportsman(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    public Sportsman() {

    }

    @Override
    public void eat() {
        System.out.println("运动员在吃饭中");
    }
    public abstract void play();
}
