package site.catyy.thread.phaser.demo10;

import java.util.concurrent.Phaser;

/**
 * 测试awaitAdvance(int phase)方法二
 * awaitAdvance(int phase)作用：是不可中断的
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
