package site.catyy.thread.cyclicbarrier.demo04;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zhangYu
 * @date 2019/11/17
 */
public class MyService {

    private CyclicBarrier cyclicBarrier;

    public MyService(CyclicBarrier cyclicBarrier) {
        super();
        this.cyclicBarrier = cyclicBarrier;
    }

    public void testMethod() {
        try {
            Thread.sleep((int) (Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + " begin跑第一阶段！" + System.currentTimeMillis());
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " end跑第一阶段！" + System.currentTimeMillis());

            Thread.sleep((int) (Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + " begin跑第二阶段！" + System.currentTimeMillis());
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " end跑第二阶段！" + System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
