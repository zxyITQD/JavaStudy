package InterfaceClass;

public abstract class Coach extends Person {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Coach(String name, int age, int year) {
        super(name, age);
        this.year = year;
    }

    public Coach() {

    }

    public abstract void training();
}
