package InterfaceClass;

public class BasketBallSportsman extends Sportsman {
    public BasketBallSportsman(String name, int age, int level) {
        super(name, age, level);
    }

    public BasketBallSportsman() {
    }

    @Override
    public void play() {
        System.out.println("篮球运动员在打篮球");
    }
}
