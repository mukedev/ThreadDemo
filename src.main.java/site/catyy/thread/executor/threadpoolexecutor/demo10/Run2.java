package site.catyy.thread.executor.threadpoolexecutor.demo10;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的prestartAllCoreThreads()方法
 * 作用：启动全部核心线程
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 2, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        System.out.println(" 线程池中的线程A:" + pool.getPoolSize());
        System.out.println(" 启动核心线程的数量: " + pool.prestartAllCoreThreads());
        System.out.println(" 线程池中的线程B:" + pool.getPoolSize());
    }
}
