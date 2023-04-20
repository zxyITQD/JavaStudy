package InterfaceClass;

public class PingPongCoach extends Coach implements SpeakEnglish{

    public PingPongCoach(String name, int age, int year) {
        super(name, age, year);
    }

    public PingPongCoach() {

    }

    @Override
    public void training() {
        System.out.println("乒乓球教练训练中");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练在吃饭");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练能说英语");
    }
}
