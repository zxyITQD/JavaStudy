package InterfaceClass.AdapterPattern;

public class AdapterPatternTest {
    public static void main(String[] args) {
        AudioPlayer ad = new AudioPlayer();
        ad.play("mp3","音乐1.mp3");
        ad.play("vlc","音乐2.vlc");
        ad.play("mp4","音乐3.mp4");
    }
}
