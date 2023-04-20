import java.util.Arrays;
import java.util.Random;

/**
 * 二、体彩中有一项是双色球，要求在1-33号共33个红色球里选出6个，
 * 1-16号共16个蓝色球中选出一个作为中奖号码，打印结果如下图所示，请实现这个需求。
 */
public class Test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[33];
        for (int i = 0; i < 33; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[16];
        for (int i = 0; i < 16; i++) {
            arr2[i] = i+1;
        }
        System.out.println(Arrays.toString(arr2));
        int[] red = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            red[i] = num;
        }
        int bulue = r.nextInt(16) + 1;
        System.out.println("红球：" + Arrays.toString(red));
        System.out.println("蓝球：" + bulue);
    }
}
