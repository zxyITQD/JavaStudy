package com.xiaoyan.study;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 利用BigDecimal完成小数的精确运算
 */
public class Demo10 {
    public static void main(String[] args) {
        BigDecimal big = new BigDecimal(0.1);
        BigDecimal big2 = new BigDecimal(0.8);
        double v = big.add(big2).doubleValue();
        System.out.println(v);
        BigDecimal big3 = new BigDecimal(3.0);
        double v1 = big3.divide(big2, 2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(v1);

    }
}
