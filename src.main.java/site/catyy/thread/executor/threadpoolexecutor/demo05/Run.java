package site.catyy.thread.executor.threadpoolexecutor.demo05;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的awaitTermination(long timeout,TimeUnit unit)方法
 * 作用：查看在指定的时间之间线程池是否已经终止工作！
 * 此方法执行时如果还有未执行完成的任务，会出现阻塞，否则不阻塞
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        pool.execute(new MyRunnable());
        System.out.println("isShutdown = " + pool.isShutdown());
        System.out.println("awaitTermination = " + pool.awaitTermination(10, TimeUnit.SECONDS) + " " + System.currentTimeMillis());
        Thread.sleep(1000);
        pool.shutdown();
        System.out.println("awaitTermination = " + pool.awaitTermination(10, TimeUnit.SECONDS) + " " + System.currentTimeMillis());
        System.out.println("main end " + System.currentTimeMillis());
    }
}
