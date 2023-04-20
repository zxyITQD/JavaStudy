package loop;

/*
水仙花数 三位数 个位，十位，百位的立方和为它本身
 */
public class Demo2 {
    public static void main(String[] args) {
        //计数器统计水仙花数
        int num = 0;
        // 遍历
        for (int i = 100; i < 1000; i++) {
            // 个位
            int a = i % 10;
            // 十位
            int b = i / 10 % 10;
            // 百位
            int c = i / 100;
            // 判断 并更新计数器
            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println("水仙花数为：");
                System.out.println(i);
                num++;
            }
        }
        System.out.println("水仙花数的个数为：" + num + "个");
    }
}
