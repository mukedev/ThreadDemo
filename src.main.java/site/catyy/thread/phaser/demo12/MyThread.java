package site.catyy.thread.phaser.demo12;

import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

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
            phaser.awaitAdvanceInterruptibly(0,3, TimeUnit.SECONDS);
            System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
