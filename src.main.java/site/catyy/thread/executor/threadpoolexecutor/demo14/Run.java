package site.catyy.thread.executor.threadpoolexecutor.demo14;

import java.sql.Time;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run {
    public static void main(String[] args) {
        MyThreadPoolExecutor pool = new MyThreadPoolExecutor(2, 2, Integer.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        pool.execute(new MyRunnable("A1"));
        pool.execute(new MyRunnable("A2"));
        pool.execute(new MyRunnable("A3"));
        pool.execute(new MyRunnable("A4"));
    }
}
