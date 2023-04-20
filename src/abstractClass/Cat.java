package abstractClass;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    public Cat() {
    }

    // 重写方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
