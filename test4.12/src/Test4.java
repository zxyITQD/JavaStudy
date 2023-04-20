import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 小海牛收集到部分水浒英雄的卡片，我们以List集合中存储字符串数据来表示，如下：
 * 注意:以下代码直接复制使用即可
 * 请编写程序，开启3条线程，每条线程的任务都是从集合中取出（需要从集合中移除）第一张英雄卡片，每次取卡需要耗时0.1秒，直到取完为止。
 * 要求程序可以正常执行，并且在多次执行的过程中不会出现异常情况。
 */
public class Test4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("及时雨宋江");
        list.add("玉麒麟卢俊义");
        list.add("智多星吴用");
        list.add("入云龙公孙胜");
        list.add("大刀关胜");
        list.add("豹子头林冲");
        list.add("霹雳火秦明");
        list.add("双鞭呼延灼");
        list.add("小李广花荣");
        list.add("小旋风柴进");
        list.add("扑天雕李应");
        list.add("美髯公朱仝");
        list.add("花和尚鲁智深");
        list.add("行者武松");
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,
                3,
                100,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 3; i++) {
            poolExecutor.submit(() -> {
                while (true) {
                    if (list.size() == 0) {
                        break;
                    }
                    synchronized (list) {
                        System.out.println("线程" + Thread.currentThread().getName() + "获得英雄：" + list.removeFirst());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            });

        }
        poolExecutor.shutdown();
    }
}
