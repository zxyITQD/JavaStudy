package com.xiaoyan.study;

public class SmartPhone extends Phone implements Autodyne{
    public SmartPhone() {
    }

    public SmartPhone(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void call(String name) {
        System.out.println("触屏拨打" + name);
    }

    @Override
    public void autodyne() {
        System.out.println("打开前置摄像头自拍");
    }
}
