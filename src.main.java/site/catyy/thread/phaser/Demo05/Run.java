package site.catyy.thread.phaser.Demo05;

import java.util.concurrent.Phaser;

/**
 * Phaser类的getRegisteredParties()方法和register()测试
 * register()作用：动态添加一个parties值
 * getRegisteredParties()作用：获取parties数量
 *
 * @author zhangYu
 * @date 2019/11/22
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(5);
        System.out.println(phaser.getRegisteredParties());

        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());
        phaser.register();
        System.out.println(phaser.getRegisteredParties());

    }
}
