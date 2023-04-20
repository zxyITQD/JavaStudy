package abstractClass;

public abstract class Animal {
    private String name;
    private String color;
    // 抽象方法
    public abstract void eat();

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drink(){
        System.out.println("喝水");
    }
}
