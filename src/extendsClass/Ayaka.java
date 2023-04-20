package extendsClass;

// 神里绫华
public class Ayaka extends GenshinImpact {
    private String sex; // 性别
    private String country; // 国家
    private double stature; // 身高

    public String getSex() {
        return sex;
    }

    // 子类空参 父类无空参构造 需要对父类初始化数据
    public Ayaka() {
        super("胡桃", "火");
    }

    // 子类全参 父类无空参构造 需要对父类初始化数据
    public Ayaka(String sex, String country, double stature) {
        super("钟离", "岩");
        this.sex = sex;
        this.country = country;
        this.stature = stature;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getStature() {
        return stature;
    }

    public void setStature(double stature) {
        this.stature = stature;
    }

    // 子类独有方法
    public void speak() {
        System.out.println("旅行者我马上要复刻了，想娶我带够原石没有呀！");
    }

    // 子类重写父类方法
    @Override
    public void godTask() {
        System.out.println("玩什么魔神任务，我的传说任务不香吗？");
    }

    @Override
    public String toString() {
        return "Ayaka{" +
                "性别为：'" + sex + '\'' +
                ", 国家为：'" + country + '\'' +
                ", 身高为：" + stature + ",元素类型为：" + getEleType() +
                '}';
    }
}
