package cn.mesie.one;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by 2019-04-20 23:50
 *
 * @author: mesie
 */
public class NetworkConnectionsLoader implements Runnable {
    @Override
    public void run() {
        // 输出一条消息
        System.out.printf("Begining network connections loading: %s\n",new Date());

        // 休眠6s
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 输出一条消息
        System.out.printf("Network connections loading has finished: %s\n",new Date());
    }
}
