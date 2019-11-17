package site.catyy.thread.cyclicbarrier.demo05;


import java.util.concurrent.CyclicBarrier;

/**
 * 测试CyclicBarrier线程异常
 * 测试结果：1.当某个线程发生异常，则其他线程继续等待，并不会影响到主流程！
 * 2.当某个线程被中断，则会抛出损坏异常或者中断异常！
 *
 * @author zhangYu
 * @date 2019/11/17
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, new Runnable() {
            @Override
            public void run() {
                System.out.println("完成");
            }
        });
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
