package InterfaceClass;

// 匿名内部类
/*
当某个方法需要接口或者抽象类的子类对象作为参数时，可以把匿名内部类传进去
 */
/*
匿名内部类与lambda的区别
所需类：匿名内部类所需的可以是接口，抽象类，具体类。
        lambda所需必须是接口且抽象方法只能有一个
匿名内部类编译生成.class字节码文件    lambda表达式在程序运行时动态生成字节码文件
 */
public class TestSwimming {
    public static void main(String[] args) {
        getSwimming(new Swimming() {
            @Override
            public void swimming() {
                System.out.println("重写");
            }
        });
        // jdk8 lambda表达式 当接口只有一个抽象方法时（函数式接口）
        getSwimming(() -> {
            System.out.println("lambda表达式函数式编程");
        });
        System.out.println();
    }

    // 多态
    public static void getSwimming(Swimming s) {
//        System.out.println("成功"+ s);
        s.swimming();
    }
}
