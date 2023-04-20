package Static;

// 静态修饰符static
/*
类加载就加载 优先对象初始化 被静态修饰的变量或方法属于本类
 */
// 静态成员变量
public class Demo1 {
    // 静态代码块 一般做一些初始化行为 比如jdbc数据库连接
    static {
    }

    public static String name;
    public static void test(){
        System.out.println("静态成员方法被加载");
    }

}
