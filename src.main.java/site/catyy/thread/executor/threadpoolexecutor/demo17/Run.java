package site.catyy.thread.executor.threadpoolexecutor.demo17;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run {

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        for (int i = 0; i < 50; i++) {
            MyRunnable r = new MyRunnable("username" + (i + 1));
            pool.execute(r);
        }
    }
}
