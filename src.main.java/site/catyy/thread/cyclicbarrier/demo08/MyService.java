package site.catyy.thread.cyclicbarrier.demo08;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangYu
 * @date 2019/11/17
 */
public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    public void testMethod() {
        try {

            if ("Thread-3".equals(Thread.currentThread().getName())) {
                System.out.println(Thread.currentThread().getName() + " 执行Thread.sleep(Integer.MAX_VALUE);");
                Thread.sleep(Integer.MAX_VALUE);
            }
            System.out.println(Thread.currentThread().getName() + "进入! ");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
