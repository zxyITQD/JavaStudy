package com.xiaoyan.study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 完成Date对象和字符串的互换
 *     SimpleDateFormat
 */
public class Demo7 {
    public static void main(String[] args) {
        String s = "2023-12-23 17:23:56";
        SimpleDateFormat ad = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date d = ad.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date d2 = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sd.format(d2);
        System.out.println(time);

    }
}
