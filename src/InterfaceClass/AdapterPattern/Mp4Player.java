package InterfaceClass.AdapterPattern;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("播放mp4音乐，文件名："+ filename);
    }
}
