package cn.mesie.one;

import cn.mesie.one.task.DataSourcesLoader;
import cn.mesie.one.task.NetworkConnectionsLoader;

import java.util.Date;

/**
 * Created by 2019-04-20 23:49
 * 等待线程的终止
 * @author: mesie
 */
public class Main05 {
    public static void main(String[] args) {
        // 创建并启动数据源加载器
        DataSourcesLoader dsLoader = new DataSourcesLoader();
        Thread thread1 = new Thread(dsLoader, "DataSourceThread");

        thread1.start();

        // 创建并且启动网络连接加载器
        NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
        Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
        thread2.start();

        // 待待两个线程的任务完成
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 两个任务都完成后输出一条消息
        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());

    }

}
