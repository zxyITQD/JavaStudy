package InterfaceClass;

public class BasketBallCoach extends Coach {
    public BasketBallCoach(String name, int age, int year) {
        super(name, age, year);
    }

    public BasketBallCoach() {
    }

    @Override
    public void training() {
        System.out.println("篮球教练训练中");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练在吃饭");
    }
}
