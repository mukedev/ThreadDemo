package site.catyy.thread.phaser.demo02;


import java.util.concurrent.Phaser;

/**
 * 测试Phaser类方法arriveAndDeregister()使用
 * arriveAndDeregister()作用：使parties值减1
 *
 * @author zhangYu
 * @date 2019/11/21
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;
        ThreadA threadA = new ThreadA(phaser);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(phaser);
        threadB.setName("B");
        threadB.start();

        ThreadC threadC = new ThreadC(phaser);
        threadC.setName("C");
        threadC.start();

    }
}
