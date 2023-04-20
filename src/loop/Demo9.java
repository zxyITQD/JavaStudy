package loop;

// 森林里有一只熊怪，很爱吃核桃。不过它有个习惯，每次都把找到的核桃分成相等的两份，
// 吃掉一份，留一份。如果不能等分，熊怪就会扔掉一个核桃再分。
//第二天再继续这个过程，直到最后剩一个核桃了，直接丢掉。
//有一天，熊怪发现了1543个核桃，请问，它在吃这些核桃的过程中，它一共要丢掉多少个核桃。
public class Demo9 {
    public static void main(String[] args) {
        // 1543个核桃
        int he = 1543;
        int give = 0;
        while (true) {
            he = he / 2;
            if (he % 2 != 0) {
                give++;
                if (he == 1) {
                    give++;
                    break;
                }
            }
        }
        System.out.println("它一共要丢掉:" + give + "个核桃");
    }
}
