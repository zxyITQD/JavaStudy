package lambda;

public class Test3 {
    public static void main(String[] args) {
        // 匿名内部类
        double d = new TestInterface3() {

            @Override
            public double getGirth(double x, double y) {
                return 2 * (x + y);
            }
        }.getGirth(4, 7);
        System.out.println(d);
        // lambda表达式
        TestInterface3 t = (x, y) -> {
            return 2 * (x + y);
        };
        System.out.println(t.getGirth(4, 7));
        // 简化
        TestInterface3 t2 = (x, y) -> 2 * (x + y);
        System.out.println(t2.getGirth(4, 7));

        System.out.println(getTest(t2));
    }

    // 多态
    public static double getTest(TestInterface3 t) {
        return t.getGirth(4, 7);
    }
}
