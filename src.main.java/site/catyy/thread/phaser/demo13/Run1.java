package site.catyy.thread.phaser.demo13;

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
        Phaser phaser = new Phaser(2);
        MyThread mt1 = new MyThread(phaser);
        mt1.setName("mt1");
        mt1.start();
    }
}
