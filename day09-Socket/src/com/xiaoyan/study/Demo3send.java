package com.xiaoyan.study;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP协议 发送端
 */
public class Demo3send {
    public static void main(String[] args) throws Exception {
        /**
         * 发送目的地
         */
        InetAddress address = InetAddress.getByName("192.168.62.218");
        int port = 9527;
        Socket socket = new Socket(address,port);
        System.out.println("请求建立连接");
        /**
         * 发送数据
         */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = "豫章故郡，洪都新府。星分翼轸，地接衡庐。襟三江而带五湖，控蛮荆而引瓯越。物华天宝，龙光射牛斗之墟；人杰地灵，徐孺下陈蕃之榻。雄州雾列，俊采星驰。台隍枕夷夏之交，宾主尽东南之美。都督阎公之雅望，棨戟遥临；宇文新州之懿范，襜帷暂驻。十旬休假，胜友如云；千里逢迎，高朋满座。腾蛟起凤，孟学士之词宗；紫电青霜，王将军之武库。家君作宰，路出名区；童子何知，躬逢胜饯。";
        byte[] bytes = str.getBytes();
        bw.write(str);
        bw.newLine();
        bw.flush();
        socket.close();
    }
}
