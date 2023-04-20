package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 有一个小球 高度100 落地弹起高度原来的一半
 * 第10次小球弹起的高度为多少 经过的总路程为多少
 * 1 50 100+50
 * 2 25 100+ 50+50+25
 * 3 12.5 100+50+50+25+25+12.5
 */
public class Test3 {
    public static void main(String[] args) {
        BigDecimal big1 = new BigDecimal(100.0);
        double n = Math.pow(2, 10) * 1.0;
        System.out.println(n);
        BigDecimal big2 = new BigDecimal(n);
        BigDecimal c = big1.divide(big2,10, RoundingMode.HALF_UP);
        double high = c.doubleValue();
        System.out.println("小球高度为" +high);
        double road = 100.0;
        for (int i = 1; i <= 9; i++) {
            double m = Math.pow(2,i)*1.0;
            BigDecimal d = new BigDecimal(m);
            BigDecimal e = big1.divide(d,10,RoundingMode.HALF_UP);
            double f = e.doubleValue();
            road += f*2;
        }
        road += high;
        System.out.println("路程为"+road);
    }
}
