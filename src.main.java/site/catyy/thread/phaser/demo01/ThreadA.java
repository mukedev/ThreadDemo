package site.catyy.thread.phaser.demo01;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/21
 */
public class ThreadA extends Thread {

    private Phaser phaser;

    public ThreadA(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodA();
    }
}
