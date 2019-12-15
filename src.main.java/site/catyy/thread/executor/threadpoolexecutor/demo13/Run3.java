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
public class Run3 {

    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " run end!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2)
        ,new ThreadPoolExecutor.DiscardOldestPolicy());
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r); //报错
    }
}
