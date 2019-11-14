package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Service {

    private CountDownLatch down = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备");
            down.await();
            System.out.println(Thread.currentThread().getName() + "结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        down.countDown();
        System.out.println("开始！");
    }
}
