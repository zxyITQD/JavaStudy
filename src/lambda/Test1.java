package lambda;
// 讲义中3个lambda表达式的练习
//   要求两种方式实现
//   匿名内部类和lambda表达式
public class Test1 {
    public static void main(String[] args) {
        // 匿名内部类
        new TestInterface1() {

            @Override
            public void shopping() {
                System.out.println("今天购物...");
            }
        }.shopping();
        // lambda表达式
        TestInterface1 t = () -> {
            System.out.println("lambda和我一起购物");
        };
        TestInterface1 t2 = () -> System.out.println("lambda和我一起购物...");
        t.shopping();
        t2.shopping();
    }
}
