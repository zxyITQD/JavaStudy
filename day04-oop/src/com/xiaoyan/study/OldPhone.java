package com.xiaoyan.study;

public class OldPhone extends Phone implements Help{
    public OldPhone() {
    }

    public OldPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void call(String name) {
        System.out.println("点击按键拨打" + name);
    }

    @Override
    public void help() {
        System.out.println("紧急呼叫");
    }
}
