package site.catyy.thread.executor.threadpoolexecutor.demo05;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的awaitTermination(long timeout,TimeUnit unit)方法
 * 测试等待执行完毕的效果！
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 5, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.shutdown();
        System.out.println(pool.awaitTermination(Integer.MAX_VALUE, TimeUnit.SECONDS) + " " + System.currentTimeMillis() + " 任务全部执行完成！");
    }
}
