package site.catyy.thread.phaser.demo02;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/21
 */
public class PrintTools {
    public static Phaser phaser;

    public static void methodA() {
        System.out.println(Thread.currentThread().getName() + " A1 begin=" + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A1 end=" + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " A2 end=" + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A2 end=" + System.currentTimeMillis());
    }

    public static void methodB() {
        try {
            System.out.println(Thread.currentThread().getName() + " B1 begin=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("r1: " + phaser.getRegisteredParties());
            phaser.arriveAndDeregister();
            System.out.println("r2: " + phaser.getRegisteredParties());
            System.out.println(Thread.currentThread().getName() + " B1 end=" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
