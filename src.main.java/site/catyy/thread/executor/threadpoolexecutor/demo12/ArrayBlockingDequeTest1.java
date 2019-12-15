package site.catyy.thread.executor.threadpoolexecutor.demo12;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试3种队列（ArrayBlockingQueue,LinkedBlockingQueue,SynchronousQueue）最大值
 *
 * @author zhangYu
 * @date 2019/12/15
 */
public class ArrayBlockingDequeTest1 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Runnable> linked = new ArrayBlockingQueue<Runnable>(2);
        System.out.println(linked.size());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 3, 5, TimeUnit.SECONDS, linked);
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        executor.execute(new MyRunnable());
        System.out.println(executor.getPoolSize() + " " + linked.size());
        //执行3个任务,2个任务放入队列
    }
}
