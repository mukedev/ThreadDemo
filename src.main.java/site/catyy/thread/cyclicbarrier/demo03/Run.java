package site.catyy.thread.cyclicbarrier.demo03;

import java.util.concurrent.CyclicBarrier;

/**
 * 测试getNumberWaiting()方法
 *
 * @author zhangYu
 * @date 2019/11/17
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);

        MyThread mt1 = new MyThread(cyclicBarrier);
        mt1.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        MyThread mt2 = new MyThread(cyclicBarrier);
        mt2.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        MyThread mt3 = new MyThread(cyclicBarrier);
        mt3.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());

        MyThread mt4 = new MyThread(cyclicBarrier);
        mt4.start();
        Thread.sleep(500);
        System.out.println(cyclicBarrier.getNumberWaiting());
    }
}
