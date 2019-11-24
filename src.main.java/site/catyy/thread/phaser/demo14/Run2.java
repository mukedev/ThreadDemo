package site.catyy.thread.phaser.demo14;

import java.util.concurrent.Phaser;

/**
 * 测试Phaser类的forceTermination()和isTerminated()方法
 * forceTermination()作用：使Phaser对象的屏障功能失效
 * isTerminated()作用：判断Phaser对象是否已经呈销毁状态
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(3);
        // 增加一个parties
        phaser.register();
        System.out.println("register=" + phaser.getRegisteredParties());
        for (int i = 0; i < 3; i++) {
            MyThread mt = new MyThread(phaser);
            mt.start();
        }
        Thread.sleep(5000);
        // 销毁一个parties
        phaser.arriveAndDeregister();
        System.out.println("getRegisteredParties=" + phaser.getRegisteredParties());
    }
}
