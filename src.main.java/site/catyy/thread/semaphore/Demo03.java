package site.catyy.thread.semaphore;

import java.util.concurrent.Semaphore;

/**
 * 测试多次调用Semaphore类的release() 或 release(int) 可以动态增加permits的个数
 *
 * @author zhangYu
 */
public class Demo03 {

    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(5);
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire(2);
            // 注意 acquire消耗不能超出初始大小
            System.out.println(semaphore.availablePermits());

            semaphore.release();
            semaphore.release();
            System.out.println(semaphore.availablePermits());
            semaphore.release(5);
            System.out.println(semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
