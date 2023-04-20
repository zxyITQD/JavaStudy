package genericity;

public class TestPlay {
    public static void main(String[] args) {
        PlayGame<String> p = new PlayGame<>();
        p.paly("羽毛");
        PlayGame<Integer> p2 =new PlayGame<>();
        p2.paly(12);
    }
}
