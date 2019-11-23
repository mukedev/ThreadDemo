package site.catyy.thread.phaser.demo08;

import java.util.concurrent.Phaser;

/**
 * Phaser类的arrive()方法测试
 * arrive()作用:使parties值加1
 *
 * @author zhangYu
 * @date 2019/11/23
 */
public class Run {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("到达了未通过！phase" + phase + " registeredParties=" + registeredParties);
                return super.onAdvance(phase, registeredParties);
            }
        };

        System.out.println("A1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        System.out.println("A2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("A2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        System.out.println("B1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B1 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        System.out.println("B2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
        phaser.arrive();
        System.out.println("B2 getPhase=" + phaser.getPhase() + " getRegisteredParties=" + phaser.getRegisteredParties() + "getArrivedParties=" + phaser.getArrivedParties());
    }
}
