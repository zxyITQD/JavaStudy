package collection.arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(10);
        ArrayList <String> al2  = new ArrayList<>(10);
        al2.add("a");
        al2.add("b");
        al2.add("c");
        al2.add("d");
        al.add(0, new int[]{2, 3});
        System.out.println(al);
        al.add(1, "张三");
//        System.out.println(al.size());
//        System.out.println(al.remove(1));
//        System.out.println(al.size());
        Object o = al.get(0);
        int[] arr = (int[]) o;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 2 3
        }
        List list = al.subList(0, 1);
        System.out.println(list.size()); // 1
        // 迭代器遍历集合
        Iterator <String> it = al2.iterator();// 迭代器
        while(it.hasNext()){
            String s2 = it.next();
            System.out.println(s2);
        }
        // 增强for循环
        for(int a:arr){
            System.out.println(a);
        }
        for(Object ob:al){
            System.out.println(ob.toString());
        }
    }
}
