package site.catyy.thread.phaser.demo11;

import java.util.concurrent.Phaser;

/**
 * 测试awaitAdvanceInterruptiblye(int phase)方法二
 * awaitAdvanceInterruptibly(int phase)作用：
 * 1.此方法是可中断的；
 * 2.如果传入参数phase值和当前getPhase()方法返回值一样，则在屏障处等待，否则继续向下面运行
 *
 * @author zhangYu
 * @date 2019/11/23
 */
public class Run {

    public static void main(String[] args) {
        try {
            Phaser phaser = new Phaser(3);

            MyThread mt = new MyThread(phaser);
            mt.setName("mt");
            mt.start();

            Thread.sleep(5000);
            mt.interrupt();
            System.out.println("中断了mt！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
