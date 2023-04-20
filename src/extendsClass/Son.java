package extendsClass;
/*
构造方法不具备继承
 */
public class Son extends Father {
    int num = 20;

    public Son(int num) {
        // 这里默认有一个父类的空参构造super() 当父类没有空参的构造方法时 必须先调用父类的有参构造方法 对父类先初始化
        super(10);
        this.num = num;
    }
}
