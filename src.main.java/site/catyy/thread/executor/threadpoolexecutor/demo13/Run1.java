package site.catyy.thread.executor.threadpoolexecutor.demo13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试AbortPolicy策略 当任务添加到线程池被拒绝时，它将抛出RejectedExecutionException异常
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run1 {

    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " run end!!!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2)
        ,new ThreadPoolExecutor.AbortPolicy());
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r); //报错
    }
}
