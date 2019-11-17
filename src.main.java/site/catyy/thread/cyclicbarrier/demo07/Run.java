package site.catyy.thread.cyclicbarrier.demo07;

import java.util.concurrent.CyclicBarrier;

/**
 * 测试getNumberWaiting() 和 getParties()
 *
 * @author zhangYu
 * @date 2019/11/17
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        int partiesValue = 5;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(partiesValue);
        MyService ms = new MyService(cyclicBarrier);

        MyThread[] mt = new MyThread[partiesValue];
        for (int i = 0; i < partiesValue; i++) {
            mt[i] = new MyThread(ms);
            mt[i].start();
        }

        Thread.sleep(2000);
        System.out.println("cyclicBarrier.getNumberWaiting(): " + cyclicBarrier.getNumberWaiting());
        System.out.println("cyclicBarrier.getParties(): " + cyclicBarrier.getParties());

    }
}
