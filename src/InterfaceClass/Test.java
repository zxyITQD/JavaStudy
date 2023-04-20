package InterfaceClass;
/*
某个俱乐部有两种体育运动，乒乓球、篮球；
有相应的教练和运动员；
他们都要进行一些常规的训练操作；
与乒乓球相关的人员，由于外事活动的需要，需要学习英文。

请使用面向对象相关知识描述上述场景。

 */
public class Test {
    public static void main(String[] args) {
        PingPongCoach ppc = new PingPongCoach("张三教练",45,7);
        System.out.println(ppc.getName());
        System.out.println(ppc.getAge());
        System.out.println(ppc.getYear());
        ppc.eat();
        ppc.training();
        ppc.speak();
        Coach c = new PingPongCoach();
        Demo(c);
        Demo(new BasketBallCoach());
    }
    public static void Demo(Coach coach){
       coach.training();
    }
}
