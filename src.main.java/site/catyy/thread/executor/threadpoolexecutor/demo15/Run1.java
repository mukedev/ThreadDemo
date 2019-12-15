package site.catyy.thread.executor.threadpoolexecutor.demo15;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的remove()方法
 * @author zhangYu
 * @date 2019/12/15
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
                Thread.sleep(6000);
                System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 100, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
        pool.execute(r);
        Thread.sleep(1000);
        pool.remove(r);
        System.out.println("任务正在运行不能删除");
    }
}
