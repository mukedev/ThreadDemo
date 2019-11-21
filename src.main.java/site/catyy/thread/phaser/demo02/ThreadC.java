package site.catyy.thread.phaser.demo02;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/21
 */
public class ThreadC extends Thread {

    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
