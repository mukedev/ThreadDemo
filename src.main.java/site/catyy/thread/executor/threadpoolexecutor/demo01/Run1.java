package site.catyy.thread.executor.threadpoolexecutor.demo01;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的构造方法
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run1 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 8, 10, TimeUnit.SECONDS, new LinkedBlockingDeque());
        System.out.println(threadPoolExecutor.getCorePoolSize());
        System.out.println(threadPoolExecutor.getMaximumPoolSize());
        System.out.println();
        ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor(5, 9, 10, TimeUnit.SECONDS, new SynchronousQueue<>());
        System.out.println(threadPoolExecutor1.getCorePoolSize());
        System.out.println(threadPoolExecutor1.getMaximumPoolSize());

    }
}
