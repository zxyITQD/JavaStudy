package InterfaceClass;

public class TestFly {
    public static void main(String[] args) {
        //
        test((String s) ->{
            System.out.println("张伟收到 over!" + s);
        });
    }
    // 多态
    public static void test(FlyInterface f){

        // 编译看父类 实现看子类
        f.fly("上下左右 ba ba go go go");
    }
}
