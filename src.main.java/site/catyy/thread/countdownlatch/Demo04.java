package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 跑步比赛：完整流程
 *
 * @author zhangYu
 */
public class Demo04 {

    public static void main(String[] args) throws InterruptedException {

        // 等待运动员到场
        CountDownLatch comingTag = new CountDownLatch(10);
        // 等待准备开始
        CountDownLatch waitTag = new CountDownLatch(1);
        // 等待起跑
        CountDownLatch waitRunTag = new CountDownLatch(10);
        // 起跑
        CountDownLatch runTag = new CountDownLatch(1);
        // 所有运动员到达终点
        CountDownLatch endTag = new CountDownLatch(10);

        // 多少个人赛跑
        int person = 10;

        ThreadC[] tc = new ThreadC[person];

        for (int i = 0; i < tc.length; i++) {
            tc[i] = new ThreadC(comingTag, waitTag, waitRunTag, runTag, endTag);
            tc[i].setName("运动员" + (i + 1));
            tc[i].start();
        }
        System.out.println("裁判正在等待。。。");
        Thread.sleep(1000);
        comingTag.await();
        System.out.println("运动员全部到场！");
        waitTag.countDown();
        waitRunTag.await();
        Thread.sleep(2000);
        System.out.println("法令抢响起。。。");
        runTag.countDown();
        endTag.await();
        System.out.println("所有运动员到达，统计比赛名次！");
    }


}
