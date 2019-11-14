package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class ThreadC extends Thread {

    private CountDownLatch comingTag;
    private CountDownLatch waitTag;
    private CountDownLatch waitRunTag;
    private CountDownLatch runTag;
    private CountDownLatch endTag;

    public ThreadC(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch runTag, CountDownLatch endTag) {
        super();
        this.comingTag = comingTag;
        this.waitTag = waitTag;
        this.waitRunTag = waitRunTag;
        this.runTag = runTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "正在光速赶来！");
            comingTag.countDown();
            System.out.println(Thread.currentThread().getName() + "已到场！等待裁判说准备！");
            waitTag.await();
            System.out.println("各就各位，准备跑姿！");
            waitRunTag.countDown();
            runTag.await();
            System.out.println(Thread.currentThread().getName() + "起跑，跑了多长时间不知道！");
            Thread.sleep((int) (Math.random() * 10000));
            endTag.countDown();
            System.out.println(Thread.currentThread().getName() + "到达终点！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
