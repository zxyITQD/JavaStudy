package InterfaceClass.AdapterPattern;

public class MediaAdapter implements MediaPlayer {
    // 适配器需要实现高级播放器的功能
    AdvanceMediaPlayer ad; // 把高级播放器对象提取出来

    // 带参构造 根据传入的音频类型创建不同的音频对象
    public MediaAdapter(String audioType) {
        if (audioType.equals("vlc")) {
            ad = new VlcPlayer();
        } else if (audioType.equals("mp4")) {
            ad = new Mp4Player();
        }
    }

    // 重写方法 根据音频类型调用不同的音乐播放器
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equals("vlc")) {
            ad.playVlc(filename);
        } else if (audioType.equals("mp4")) {
            ad.playMp4(filename);
        }
    }
}
