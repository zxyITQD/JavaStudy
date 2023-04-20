package com.xiaoyan.study;

/**
 * String str = "hellojavaworldjavabigdatajavajava"; 有几个java单词
 * 查找并截取
 * 改变查询范围 不截取
 */
public class Demo4 {
    public static void main(String[] args) {
        String str = "hellojavaworldjavabigdatajavajava";
        String key = "java";
        System.out.println(getCount(str, key));
        System.out.println(getCountNew(str, key));
    }

    /**
     * 第一问
     */
    public static int getCount(String str, String key) {
        int count = 0;
        while (true) {
            int index = str.indexOf(key);
            if (index >= 0) {
                count++;
                int round = index + key.length();
                str = str.substring(round);
            } else {
                break;
            }

        }
        return count;
    }
    /**
     * 第二问
     */
    public static int getCountNew(String str,String key){
        int count = 0;
        int index = -1;
        while ((index = str.indexOf(key,index)) >=0){
            count++;
            index = index+key.length();
        }
        return count;
    }
}
