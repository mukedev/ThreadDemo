package site.catyy.thread.cyclicbarrier.demo04;


import java.util.concurrent.CyclicBarrier;

/**
 * 用CyclicBarrier类测试阶段性跑步比赛
 *
 * @author zhangYu
 * @date 2019/11/17
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        MyService myService = new MyService(cyclicBarrier);

        MyThread mt1 = new MyThread(myService);
        mt1.setName("mt1");
        mt1.start();

        MyThread mt2 = new MyThread(myService);
        mt2.setName("mt2");
        mt2.start();

        MyThread mt3 = new MyThread(myService);
        mt3.setName("mt3");
        mt3.start();

        MyThread mt4 = new MyThread(myService);
        mt4.setName("mt4");
        mt4.start();
    }
}
