package site.catyy.thread.cyclicbarrier.demo05;

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
            System.out.println(Thread.currentThread().getName() + " 到了等待其他人开始起跑！" + System.currentTimeMillis());
            if ("mt2".equals(Thread.currentThread().getName())) {
                Integer.parseInt("s");
                // 测试中断
                //Thread.currentThread().interrupt();
            }
            cyclicBarrier.await();
            System.out.println("到达终点，结束比赛！");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "进入了InterruptedException e " + cyclicBarrier.isBroken());
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println(Thread.currentThread().getName() + "进入了BrokenBarrierException e " + cyclicBarrier.isBroken());
            e.printStackTrace();
        }

    }
}
