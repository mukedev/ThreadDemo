package site.catyy.thread.executor.threadpoolexecutor.demo07;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run3 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        pool.setThreadFactory(new MyThreadFactory());
        pool.execute(mr);
    }
}
