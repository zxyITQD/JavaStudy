package com.xiaoyan.study;

/**
 * 判断一个字符串是否是回文
 */
public class Demo5 {
    public static void main(String[] args) {
        String s = "雾锁山头山锁雾";
        if(isHuiwen(s)){
            System.out.println("是回文");
        }else {
            System.out.println("不是回文");
        }
    }
    /**
     * 定义一个方法判断是否为回文
     */
    public static boolean isHuiwen(String str){
        StringBuilder s = new StringBuilder();
         s.append(str);
         String newStr = s.reverse().toString();
         return str.equals(newStr);
    }
}
