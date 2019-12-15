package site.catyy.thread.executor.threadpoolexecutor.demo13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试DiscardOldestPolicy策略 当任务添加到线程池被拒绝时，线程池会放弃等待队列中最旧未处理任务，然后将被拒绝的任务添加到等待队列中。
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run4 {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " run end!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(2);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS,queue
        ,new ThreadPoolExecutor.DiscardPolicy());
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        Thread.sleep(5000);
        System.out.println(pool.getPoolSize() + " "  + queue.size());
    }
}
