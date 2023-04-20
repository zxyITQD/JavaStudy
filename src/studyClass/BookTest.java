package studyClass;

public class BookTest {
    public static void main(String[] args) {
        // 初始化成员变量
        Book b = new Book("高等元素论","op们",200);
        System.out.println(b);
        Book b2 = new Book();
        System.out.println(b2);
    }
}
