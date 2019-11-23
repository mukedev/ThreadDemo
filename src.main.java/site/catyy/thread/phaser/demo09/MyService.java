package site.catyy.thread.phaser.demo09;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/23
 */
public class MyService {
    private Phaser phaser;

    public MyService(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void testMethod() {
        System.out.println(Thread.currentThread().getName() + " A begin " + " getPhase=" + phaser.getPhase() + " " + System.currentTimeMillis());
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " A end " + " getPhase=" + phaser.getPhase() + " " + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " B begin " + " getPhase=" + phaser.getPhase() + " " + System.currentTimeMillis());
        phaser.awaitAdvance(1);
        phaser.arriveAndAwaitAdvance();
        System.out.println(Thread.currentThread().getName() + " B end " + " getPhase=" + phaser.getPhase() + " " + System.currentTimeMillis());
    }

}
