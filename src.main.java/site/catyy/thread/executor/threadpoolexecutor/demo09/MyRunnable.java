package site.catyy.thread.executor.threadpoolexecutor.demo09;

import java.util.concurrent.ThreadFactory;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
        System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
    }
}
