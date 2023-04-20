package loop;

/*
20元，买可乐，3元一瓶，一个空瓶子能退1元，请问能买多少瓶？？ 不允许赊账。
20对3取余
 */
public class Demo13 {
    public static void main(String[] args) {
        int a = 20;
        int count = 0;
        while (a > 3) {
            int temp = 0;
            temp = a / 3;
            a = a % 3 + temp;
            count += temp;
        }
        System.out.println(count);
    }
}
