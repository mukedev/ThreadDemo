package site.catyy.thread.phaser.demo01;

import java.util.concurrent.Phaser;

/**
 * 测试Phaser类的使用
 * arriveAndAwaitAdvance会阻塞到线程到达数等于parties时才执行下一步，否则一直阻塞
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
