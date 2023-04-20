package com.xiaoyan.study;

public class TestPhone {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        op.setType("旧手机");
        op.setBrand("诺基亚");
        System.out.println(op.toString());
        op.call("张三");
        op.help();
        SmartPhone sp = new SmartPhone("华为","智能手机");
        System.out.println(sp.toString());
        sp.call("李四");
        sp.autodyne();
    }
}
