package genericity;

public class TestDemo1 {
    public static void main(String[] args) {
        Demo1<String> d = new Demo1<>("张三");
        Demo1<Integer> d2 = new Demo1<>(23);
        System.out.println(d.getT());
        System.out.println(d2.getT());
    }
}
