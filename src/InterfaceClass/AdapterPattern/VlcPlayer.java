package InterfaceClass.AdapterPattern;



public class VlcPlayer implements AdvanceMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("播放vlc类型音乐，文件名：" + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
