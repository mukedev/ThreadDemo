package site.catyy.thread.phaser.demo14;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyThread extends Thread {
    private Phaser phaser;

    public MyThread(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " A begin " + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A end " + System.currentTimeMillis());
    }
}
