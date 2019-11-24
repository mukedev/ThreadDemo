package site.catyy.thread.executor.threadpoolexecutor.demo01;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试参数关系
 * A<=B
 * SynchronousQueue()
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, 8, 10, TimeUnit.SECONDS, new SynchronousQueue<>());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " run! " + System.currentTimeMillis());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        Thread.sleep(300);
        System.out.println("A:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("A:" + threadPoolExecutor.getPoolSize());
        System.out.println("A:" + threadPoolExecutor.getQueue().size());

        Thread.sleep(10000);
        System.out.println("B:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("B:" + threadPoolExecutor.getPoolSize());
        System.out.println("B:" + threadPoolExecutor.getQueue().size());

    }
}
