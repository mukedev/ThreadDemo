package site.catyy.thread.phaser.demo09;

import java.util.concurrent.Phaser;

/**
 * 测试Phaser类的awaitAdvance(int phase)
 * awaitAdvance(int phaser)方法作用：如果传入参数phase值和当前getPhase()方法返回值一样，则在屏障处等待，否则继续向下面运行
 *
 * @author zhangYu
 * @date 2019/11/23
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("到达！");
                return super.onAdvance(phase, registeredParties);
            }
        };
        MyService ms = new MyService(phaser);
        MyThread mt1 = new MyThread(ms);
        mt1.setName("mt1");
        mt1.start();

    }
}
