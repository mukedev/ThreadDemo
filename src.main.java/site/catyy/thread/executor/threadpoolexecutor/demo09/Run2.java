package site.catyy.thread.executor.threadpoolexecutor.demo09;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的allowCoreThreadTimeOut() 和 allowCoreThreadTimeOut(boolean value)方法
 * allowCoreThreadTimeOut()如果此池允许核心线程超时并终止，如果没有任务在keepAlive时间内到达，则返回true，如果新任务到达时需要更换。
 * allowCoreThreadTimeOut(boolean value)设置策略是否核心线程可能会超时，如果任务没有在活着的时间内到达，则在新任务到达时被替换。
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 5, 2, TimeUnit.SECONDS, new SynchronousQueue<>());
        pool.allowCoreThreadTimeOut(true);
        System.out.println(pool.allowsCoreThreadTimeOut());
        for (int i = 0; i < 4; i++) {
            MyRunnable runnable = new MyRunnable();
            pool.execute(runnable);
        }
        System.out.println("getPoolSize1 = " + pool.getPoolSize());
        System.out.println("getCorePoolSize1 = " + pool.getCorePoolSize());
        Thread.sleep(2100);
        System.out.println("getPoolSize2 = " + pool.getPoolSize());
        System.out.println("getCorePoolSize2 = " + pool.getCorePoolSize());
    }
}
