package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多个线程都到达同步点后才开始执行
 *
 * @author zhangYu
 */
public class Demo02 {

    public static void main(String[] args) throws InterruptedException {
        int count = 10;
        CountDownLatch down = new CountDownLatch(count);
        ThreadA[] threadA = new ThreadA[count];
        for (int i = 0; i < count; i++) {
            threadA[i] = new ThreadA(down);
            threadA[i].start();
        }
        down.await();
        System.out.println("都到达了！");

    }
}
