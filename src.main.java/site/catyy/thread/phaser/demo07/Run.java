package site.catyy.thread.phaser.demo07;

import java.util.concurrent.Phaser;

/**
 * Phaser类的getArrivedParties()和getUnarrivedParties()方法测试
 * getArrivedParties()作用：获取已使用的parties数量
 * getUnarrivedParties())作用：获取未使用的parties数量
 *
 * @author zhangYu
 * @date 2019/11/22
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(7);
        MyThread[] mts = new MyThread[5];
        for (int i = 0; i < mts.length; i++) {
            mts[i] = new MyThread(phaser);
            mts[i].setName("Thread" + (i + 1));
            mts[i].start();
        }

        Thread.sleep(2000);
        System.out.println(" 已到达：" + phaser.getArrivedParties());
        System.out.println(" 未到达：" + phaser.getUnarrivedParties());

    }
}
