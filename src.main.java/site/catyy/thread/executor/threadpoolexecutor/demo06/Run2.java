package site.catyy.thread.executor.threadpoolexecutor.demo06;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) {
        MyRunnable1 mr = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        pool.setThreadFactory(new MyThreadFactory());
        pool.execute(mr);
    }
}
