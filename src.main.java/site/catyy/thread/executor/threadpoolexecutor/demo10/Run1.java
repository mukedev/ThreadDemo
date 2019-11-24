package site.catyy.thread.executor.threadpoolexecutor.demo10;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的prestartCoreThreads()方法
 * 作用：每调一次启动一个线程且返回true，直到核心线程全部启动并返回false
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        System.out.println(" 线程池中的线程A:" + pool.getPoolSize());
        System.out.println("Z1 = " + pool.prestartCoreThread());
        System.out.println(" 线程池中的线程B:" + pool.getPoolSize());
        System.out.println("Z2 = " + pool.prestartCoreThread());
        System.out.println(" 线程池中的线程C:" + pool.getPoolSize());
        System.out.println("Z3 = " + pool.prestartCoreThread());
        System.out.println("Z4 = " + pool.prestartCoreThread());
        System.out.println("Z5 = " + pool.prestartCoreThread());
        System.out.println("Z6 = " + pool.prestartCoreThread());
        System.out.println(" 线程池中的线程D:" + pool.getPoolSize());
    }
}
