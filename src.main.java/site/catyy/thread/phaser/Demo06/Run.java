package site.catyy.thread.phaser.Demo06;

import java.util.concurrent.Phaser;

/**
 * Phaser类的bulkRegister()方法测试
 * 作用：批量增加parties数量
 *
 * @author zhangYu
 * @date 2019/11/22
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(5);
        System.out.println(phaser.getRegisteredParties());

        phaser.bulkRegister(5);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(5);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(5);
        System.out.println(phaser.getRegisteredParties());
        phaser.bulkRegister(5);
        System.out.println(phaser.getRegisteredParties());


    }
}
