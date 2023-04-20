import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        Random r = new Random();
        /*可变红球集合*/
        ArrayList<Integer> a = new ArrayList<>(33);
        for (int i = 0; i < 33; i++) {
            a.add(i + 1);
        }
        System.out.println(Arrays.toString(a.toArray()));
        /*可变蓝球集合*/
        ArrayList<Integer> b = new ArrayList<>(16);
        for (int i = 0; i < 16; i++) {
            b.add(i + 1);
        }
        System.out.println(Arrays.toString(b.toArray()));
        int[] red = new int[6];
        /*每次6个小球都从新集合中选 这样不会重复*/
        while (a.size() >= red.length) {
            for (int i = 0; i < red.length; i++) {
                /*随机索引*/
                int index = r.nextInt(a.size());
                /*随机索引取得的值赋予数组*/
                red[i] = a.get(index);
                /*集合移除元素*/
                a.remove(index);
            }
            System.out.println("红球：" + Arrays.toString(red));
        }

        /*每次1个小球都从新集合中选 这样不会重复*/
        while (b.size() >= 1) {
            /*随机索引*/
            int index = r.nextInt(b.size());
            /*随机索引取得的值赋予数组*/
            int bule = b.get(index);
            /*集合移除元素*/
            b.remove(index);

            System.out.println("蓝球：" + bule);
        }

    }
}
