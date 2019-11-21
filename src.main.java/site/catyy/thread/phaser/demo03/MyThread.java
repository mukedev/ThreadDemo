package site.catyy.thread.phaser.demo03;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/21
 */
public class MyThread extends Thread{
    private Phaser phaser;

    public MyThread(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value=" + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value=" + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value=" + phaser.getPhase());

        System.out.println("A begin");
        phaser.arriveAndAwaitAdvance();
        System.out.println("A   end phase value=" + phaser.getPhase());


    }
}
