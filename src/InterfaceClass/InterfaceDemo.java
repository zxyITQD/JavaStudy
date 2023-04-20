package InterfaceClass;

/*
接口本身更加抽象 不能实例对象 成员方法都是声明 具体的实现由实现类去实现 没有构造方法
为什么没有构造方法？因为实现类有自己的父类 实现类与接口没有继承关系
 */
public interface InterfaceDemo {
    // 接口中的成员变量 省略了public static final
    String name = "李四";

    // 接口中的成员方法 省略了public abstract
    void work();
    // jdk8 版本增加了default方法并且可以实现 实现类也可重写
    default int getSum(int a, int b) {
        return a + b;
    }
    // jdk8 版本增加了static 方法并且可以实现 实现类可重写
    static void testLambda(){
        System.out.println("接口中静态方法执行...");
    }
}
