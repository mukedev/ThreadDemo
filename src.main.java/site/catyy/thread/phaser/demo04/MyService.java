package site.catyy.thread.phaser.demo04;

import java.util.concurrent.Phaser;

/**
 * @author zhangYu
 * @date 2019/11/21
 */
public class MyService {
    private Phaser phaser;

    public MyService(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    public void testMethod() {
        try {
            System.out.println("A  begin ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if ("B".equals(Thread.currentThread().getName())) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("A  end ThreadName=" + Thread.currentThread().getName() +" end phase value=" + phaser.getPhase() + "  " + System.currentTimeMillis());

            System.out.println("B  begin ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if ("B".equals(Thread.currentThread().getName())) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("B  end ThreadName=" + Thread.currentThread().getName() +" end phase value=" + phaser.getPhase() + "  " + System.currentTimeMillis());

            System.out.println("C  begin ThreadName=" + Thread.currentThread().getName() + "  " + System.currentTimeMillis());
            if ("B".equals(Thread.currentThread().getName())) {
                Thread.sleep(5000);
            }
            phaser.arriveAndAwaitAdvance();
            System.out.println("C  end ThreadName=" + Thread.currentThread().getName() +" end phase value=" + phaser.getPhase() + "  " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
