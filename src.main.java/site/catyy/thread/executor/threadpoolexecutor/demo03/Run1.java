package site.catyy.thread.executor.threadpoolexecutor.demo03;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的shutdownNow()方法
 * 作用：终止所有的任务，当前未执行的线程不再执行，前提需要使用if (Thread.currentThread().isInterrupted() == true)语句来判断，如果没有则和shutdwon()方法作用一样
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable1 mr = new MyRunnable1();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 9999, 30, TimeUnit.HOURS, new LinkedBlockingDeque<>());
        pool.execute(mr);
        pool.execute(mr);
        pool.execute(mr);
        pool.execute(mr);
        Thread.sleep(1000);
        pool.shutdownNow();

        pool.execute(mr);
        System.out.println("main end!");
    }
}
