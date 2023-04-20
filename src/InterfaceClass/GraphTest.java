package InterfaceClass;

public class GraphTest {
    public static void main(String[] args) {
        // 圆形
        Circle c = new Circle();
        c.setRadius(3);
        System.out.println(c.grith()); // 18.84955592153876
        System.out.println(c.area()); //  28.274333882308138
        // 矩形
        Rectangle r = new Rectangle();
        r.setHeight(4);
        r.setWidth(6);
        System.out.println(r.grith()); // 20.0
        System.out.println(r.area()); // 24.0
    }
}
