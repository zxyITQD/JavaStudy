package com.xiaoyan.study;

public class TestSell {
    public static void main(String[] args) {
        Sell s = new Sell();
      Thread a=  new Thread(s);
      Thread b=  new Thread(s);
        a.setName("售票台1");
        b.setName("售票台2");
        a.start();
        b.start();
    }
}
