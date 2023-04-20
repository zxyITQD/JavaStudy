package InterfaceClass;

public class PingPongSportsman extends Sportsman implements SpeakEnglish {
    public PingPongSportsman(String name, int age, int level) {
        super(name, age, level);
    }

    public PingPongSportsman() {

    }

    @Override
    public void play() {
        System.out.println("乒乓球运动员在打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员在吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员能说英语");
    }
}
