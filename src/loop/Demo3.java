package loop;

public class Demo3 {
    public static void main(String[] args) {
// 定义珠穆朗玛峰的高度 纸的厚度
        double zhu = 8844430;
        double paper = 0.1;
        // 定义计数器
        int count = 0;
        while (paper <= zhu){
            paper *= 2;
            count++;
            System.out.println(paper);
        }
        System.out.println("需要折：" + count + "次");
    }
}
