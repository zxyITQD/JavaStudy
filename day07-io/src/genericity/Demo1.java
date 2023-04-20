package genericity;

public class Demo1 <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Demo1() {
    }

    public Demo1(T t) {
        this.t = t;
    }
}
