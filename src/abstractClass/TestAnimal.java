package abstractClass;
/**
定义猫类(Cat)和狗类(Dog)
​	猫类成员方法：eat（猫吃鱼）drink（喝水…）
​	狗类成员方法：eat（狗吃肉）drink（喝水…）
 */
public class TestAnimal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("大黄");
        d.setColor("黄色");
        System.out.println(d.getName());
        System.out.println(d.getColor());
        d.eat();
        d.drink();
        Cat c = new Cat("小橘","橘黄色");
        System.out.println(c.getName());
        System.out.println(c.getColor());
        c.eat();
        c.drink();
    }
}
