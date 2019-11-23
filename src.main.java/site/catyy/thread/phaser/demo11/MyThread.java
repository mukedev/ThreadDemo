package site.catyy.thread.phaser.demo11;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/23
 */
public class MyThread extends Thread {
    private Phaser phaser;

    public MyThread(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            //使线程在此阻塞
            phaser.awaitAdvanceInterruptibly(0);
            System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
