package cn.mesie.one;

import cn.mesie.one.task.PrimeGenerator;

import java.util.concurrent.TimeUnit;

/**
 * Created by 2019-04-07 22:46
 * 线程的中断
 * @author: mesie
 */
public class Main03 {
    public static void main(String[] args) {
        Thread task = new PrimeGenerator();
        // 启动质数生成线程
        task.start();
        // 主线程休眠5s
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 质数生成线程中断
        task.interrupt();
    }
}
