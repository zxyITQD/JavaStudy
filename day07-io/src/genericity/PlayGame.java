package genericity;

public class PlayGame<E> implements Play<E> {
    @Override
    public void paly(E e) {
        System.out.println("我要玩" + e + "球");
    }
}
