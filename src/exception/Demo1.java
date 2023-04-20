package exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        // 捕获运行异常
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (Exception e) {
            // 打印异常类 异常信息 异常位置 底层调用System.err 颜色为红色
            e.printStackTrace();
        }
        System.out.println("抓到了1");


        // 编译时异常
        String s = "2022-3-23";
        SimpleDateFormat sd = new SimpleDateFormat("yyy-y-MM-ss");
        // 这里可能会解析失败 编译不通过
        try {
            Date d = sd.parse(s);
        } catch (ParseException e) {
            // 打印异常类  异常信息 异常位置
            e.printStackTrace();
        }

        System.out.println("抓到了2");
    }
}
