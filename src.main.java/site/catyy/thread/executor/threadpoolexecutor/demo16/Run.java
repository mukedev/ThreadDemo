package site.catyy.thread.executor.threadpoolexecutor.demo16;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试多个get方法
 * getActiveCount:获取正在执行的线程数
 *
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyThreadA ta = new MyThreadA();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new SynchronousQueue<>());
        pool.execute(ta);
        pool.execute(ta);
        pool.execute(ta);
        pool.execute(ta);
        System.out.println("正在执行线程数：" + pool.getActiveCount() + " 线程数：" + pool.getPoolSize() +
                " 完成任务数：" + pool.getCompletedTaskCount() + " corePoolSize：" + pool.getCorePoolSize()
                + " maximumPoolSzie:" + pool.getMaximumPoolSize() + " 线程池有多少个线程：" + pool.getPoolSize()
                + " taskCount:" + pool.getTaskCount());
        Thread.sleep(7000);
        System.out.println("正在执行线程数：" + pool.getActiveCount() + " 线程数：" + pool.getPoolSize() +
                " 完成任务数：" + pool.getCompletedTaskCount() + " corePoolSize：" + pool.getCorePoolSize()
                + " maximumPoolSzie:" + pool.getMaximumPoolSize() + " 线程池有多少个线程：" + pool.getPoolSize()
                + " taskCount:" + pool.getTaskCount());
    }
}
