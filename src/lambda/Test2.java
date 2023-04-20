package lambda;

public class Test2 {
    public static void main(String[] args) {
        // 匿名内部类
        new TestInterface2() {

            @Override
            public void play(String name) {
                System.out.println(name + "和我一起玩游戏");
            }
        }.play("张三");
        // lambda表达式
        TestInterface2 t = (name) -> {
            System.out.println(name + "和我一起打篮球");
        };
        t.play("蔡徐坤");
        TestInterface2 t2 = name -> System.out.println(name + "和我一起打篮球...");
        t2.play("蔡徐坤");
    }
}
