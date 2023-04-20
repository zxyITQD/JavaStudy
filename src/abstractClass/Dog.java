package abstractClass;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    public Dog() {
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
