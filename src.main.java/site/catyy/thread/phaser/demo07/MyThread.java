package site.catyy.thread.phaser.demo07;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/22
 */
public class MyThread extends Thread{

    private Phaser phaser;

    public MyThread(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " A1 begin="+System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A1 begin="+System.currentTimeMillis());
    }
}
