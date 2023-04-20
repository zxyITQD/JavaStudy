package com.xiaoyan.study;

public abstract class Phone {
    private String brand;
    private String type;

    public String getType() {
        return type;
    }

    public Phone() {
    }

    public Phone(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void call(String name);

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }
}
