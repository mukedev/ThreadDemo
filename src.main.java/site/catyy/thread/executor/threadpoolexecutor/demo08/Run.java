package site.catyy.thread.executor.threadpoolexecutor.demo08;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolFactory类的setRejectedExecutionHandler(RejectedExecutionHandler handler)方法
 * 作用：处理被拒绝执行的任务
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable("中国1");
        MyRunnable mr2 = new MyRunnable("中国2");
        MyRunnable mr3 = new MyRunnable("中国3");
        MyRunnable mr4 = new MyRunnable("中国4");

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 3, 30, TimeUnit.SECONDS, new SynchronousQueue<>());
        pool.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        pool.execute(mr1);
        pool.execute(mr2);
        pool.execute(mr3);
        pool.execute(mr4);
    }
}
