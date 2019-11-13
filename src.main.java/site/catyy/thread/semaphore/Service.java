package site.catyy.thread.semaphore;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.concurrent.Semaphore;

public class Service {

    /*// demo01
    // 参数permits作用是设置同一时间内许可执行的线程数
    private Semaphore semaphore = new Semaphore(2);
    // private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*// demo02
    private Semaphore semaphore = new Semaphore(10);

    public void testMethod() {
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            int v = (int) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() + " 休眠了" + (v / 1000) + "s");
            Thread.sleep(v);
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    /*// demo04
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        // 设置进入的线程不被中断
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String string = new String();
            Math.random();
        }
        System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
        semaphore.release();
    }*/

    /*// demo05
    private Semaphore semaphore = new Semaphore(10);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println("可用许可数：" + semaphore.availablePermits());
            System.out.println("获取可用许可数，并置为0：" + semaphore.drainPermits() + " ，可用许可数：" + semaphore.availablePermits());
            System.out.println("可用许可数：" + semaphore.drainPermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }*/

    /*// demo06
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("大约等待的线程数：" + semaphore.getQueueLength());
            System.out.println("是否有线程等待许可呢？ " + semaphore.hasQueuedThreads());
        } catch(InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }
    }*/

    // demo07
    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1, isFair);

    public void testMethod() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("大约等待的线程数：" + semaphore.getQueueLength());
            System.out.println("是否有线程等待许可呢？ " + semaphore.hasQueuedThreads());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
