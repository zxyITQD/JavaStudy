package DateClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

// 实现日期对象和字符串之间的相互转换  格式化 format     解析 parse
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
//        System.out.println(d);
        // 日期对象与字符串之间转换
        SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");// 指定格式
        // 格式化
        System.out.println(sd.format(d));
        // 解析
        String da = "2022年3月14日 23:34:46";
        SimpleDateFormat sd2 = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
        Date d2 = sd2.parse(da);
        System.out.println(d2);

        // jdk8版本 localDateTime 没有构造方法
        LocalDateTime t = LocalDateTime.now();
        System.out.println(t);
    }
}
