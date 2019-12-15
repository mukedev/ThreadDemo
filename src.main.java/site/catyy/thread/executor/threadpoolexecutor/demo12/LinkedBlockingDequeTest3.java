package site.catyy.thread.executor.threadpoolexecutor.demo12;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试3种队列（ArrayBlockingQueue,LinkedBlockingQueue,SynchronousQueue）最大值
 * @author zhangYu
 * @date 2019/12/15
 */
public class LinkedBlockingDequeTest3 {

    public static void main(String[] args) {

        // LinkedBlockingDeque使用无参构造
        // capacity = Integer.MAX_VALUE
        LinkedBlockingDeque<Runnable> linked = new LinkedBlockingDeque<Runnable>();
        System.out.println(linked.size());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linked);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        System.out.println(executor.getPoolSize() + " " + linked.size());
        //执行2个任务,放入队列4个任务
    }
}
