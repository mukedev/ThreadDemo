package site.catyy.thread.cyclicbarrier.demo08;

import java.util.concurrent.CyclicBarrier;

/**
 * 测试reset()方法
 * 文档说明：将屏障重置为初始状态。 如果任何一方正在等待屏障，他们将返回BrokenBarrierException 。 注意，由于其他原因，
 * 发生断线后的复位可能会复杂化; 线程需要以其他方式重新同步，并选择一个执行重置。 可能更好地为后续使用创建新的屏障。
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
        System.out.println("使用重置屏障！");
        cyclicBarrier.reset();

    }
}
