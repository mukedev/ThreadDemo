package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ThreadA extends Thread {

    private CountDownLatch down;

    public ThreadA(CountDownLatch down) {
        super();
        this.down = down;
    }

    @Override
    public void run() {
        down.countDown();
        System.out.println("线程"+Thread.currentThread().getName() + "启动！");
    }
}
