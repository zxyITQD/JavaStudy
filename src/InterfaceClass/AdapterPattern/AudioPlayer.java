package InterfaceClass.AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    AdvanceMediaPlayer a;


    @Override
    public void play(String audioType, String filename) {
        if(audioType.equals("mp3")){
            System.out.println("播放mp3音乐,文件名"+filename);
        }else if(audioType.equals("vlc")){
            a = new VlcPlayer();
            a.playVlc(filename);
        }else if(audioType.equals("mp4")){
            a = new Mp4Player();
            a.playMp4(filename);
        }else {
            System.out.println("格式不支持！");
        }
    }
//    MediaAdapter ma;
//    @Override
//    public void play(String audioType, String filename) {
//        if(audioType.equals("mp3")){
//            System.out.println("播放mp3音乐，文件名为："+ filename);
//        } else if(audioType.equals("vlc")){
//            // 实例适配器对象 调用方法播放vlc
//            ma = new MediaAdapter(audioType);
//            ma.play(audioType,filename);
//        }else if(audioType.equals("mp4")){
//            // 实例适配器对象 调用方法播放mp4
//            ma = new MediaAdapter(audioType);
//            ma.play(audioType,filename);
//        } else {
//            System.out.println("此格式不支持！");
//        }
//    }
}
