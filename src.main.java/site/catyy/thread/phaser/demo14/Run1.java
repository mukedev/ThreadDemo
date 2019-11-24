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
public class Run1 {

    public static void main(String[] args) {
        int parties = 3;
        Phaser phaser = new Phaser(parties);
        MyThread[] mt = new MyThread[parties];
        for (int i = 0; i < mt.length; i++) {
            mt[i] = new MyThread(phaser);
            mt[i].start();
        }
    }
}
