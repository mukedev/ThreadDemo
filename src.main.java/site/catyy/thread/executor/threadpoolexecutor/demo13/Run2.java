package site.catyy.thread.executor.threadpoolexecutor.demo13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试CallerRunsPolicy策略当任务添加到线程池被拒绝时，会使用线程池的Thread线程对象处理被拒绝的任务
 *
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run2 {

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
        ,new ThreadPoolExecutor.CallerRunsPolicy());
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r);
        pool.execute(r); //报错
    }
}
