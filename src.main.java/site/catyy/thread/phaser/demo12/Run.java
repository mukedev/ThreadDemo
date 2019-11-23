package site.catyy.thread.phaser.demo12;

import java.util.concurrent.Phaser;

/**
 * 测试Phaser类的awaitAdvanceInterruptibly(int phase, Long timeout, TimeUnit unit)方法
 * 作用：在指定的栏数最大等待单位时间内，栏数未变，则出现异常，否则继续向下运行
 * <p>
 * 注意：使用arrive()方法，可以使phase屏障值增加，从而跳过此方法抛出异常
 *
 * @author zhangYu
 * @date 2019/11/23
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        MyThread mt = new MyThread(phaser);
        mt.start();

        // 使用arrive()方法，可以使phase屏障值增加
//        Thread.sleep(1000);
//        phaser.arrive();
//        Thread.sleep(500);
//        phaser.arrive();
//        Thread.sleep(500);
//        phaser.arrive();

    }
}
