package site.catyy.thread.phaser.demo03;

import java.util.concurrent.Phaser;

/**
 * 测试getPhase()方法
 * getPhase()作用：获取已经到第几个屏障
 *
 * @author zhangYu
 * @date 2019/11/21
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        MyThread mt = new MyThread(phaser);
        mt.start();
    }
}
