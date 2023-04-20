package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 实现浮点数的精确计算
public class Demo {
    public static void main(String[] args) {
//        double x = 0.1;
//        double y = 0.2;
//        System.out.println(x+y == 0.3);// false
        // 浮点数会损失精度 0.1在计算机里不是0.1
        // 相加
        System.out.println(add(2.3,4.5));
        // 相除
        System.out.println(doubleDvide(10.0,3.0));
    }
    // 定义方法实现浮点数的相加
    public static double add(double a,double b){
        BigDecimal bd = new BigDecimal(String.valueOf(a));
        BigDecimal bd2 = new BigDecimal(String.valueOf(b));
        return bd.add(bd2).doubleValue();
    }
    // 定义方法实现浮点数的相除
    public static double doubleDvide(double x,double y){
        BigDecimal bd = new BigDecimal(String.valueOf(x));
        BigDecimal bd2 = new BigDecimal(String.valueOf(y));
       return bd.divide(bd2,5, RoundingMode.HALF_UP).doubleValue();
    }
}
