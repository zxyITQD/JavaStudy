package com.xiaoyan.study;

public class TestSwim {
    public static void main(String[] args) {
        /**
         * 向上转型
         */
        Swimming s = new Swimming() {

            @Override
            public void swim() {
                System.out.println("我游得很快乐");
            }

            public void time() {
                System.out.println("我只能游3个小时");
            }
        };
        test(s);
    }

    public static void test(Swimming s) {
        s.swim();
    }
}
