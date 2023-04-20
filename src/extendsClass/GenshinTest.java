package extendsClass;

public class GenshinTest {
    public static void main(String[] args) {
        // 创建子类对象 调用子类无参构造
        Ayaka a = new Ayaka();
        System.out.println(a.getSex()); // null
        System.out.println(a.getCountry()); // null
        System.out.println(a.getStature()); // 0.0
        // 父类默认初始化值
        System.out.println(a.getPartName()); // 胡桃
        System.out.println(a.getEleType()); // 火
        // 创建子类对象 调用子类全参构造
        Ayaka b = new Ayaka("女","稻妻",1.56);
        System.out.println(b.getSex()); // 女
        System.out.println(b.getCountry()); // 稻妻
        System.out.println(b.getStature()); // 1.56
        // 父类默认初始化值
        System.out.println(b.getPartName()); // 钟离
        System.out.println(b.getEleType()); // 岩
        b.setEleType("冰");
        // 子类方法
        a.speak();
        // a b 有自己独立的内存空间
        a.setStature(1.76);
        System.out.println(b.getStature()); // 1.56
        // 子类重写覆盖了父类的方法
        GenshinImpact g = new GenshinImpact("甘雨","冰");
        g.godTask(); // 魔神任务开启！请旅行者查看
        a.godTask(); // 玩什么魔神任务，我的传说任务不香吗？
        // 重写toString方法打印 b对象
        System.out.println(b); // Ayaka{性别为：'女', 国家为：'稻妻', 身高为：1.56,元素类型为：冰}
    }
}
