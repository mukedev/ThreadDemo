package site.catyy.thread.executor.threadpoolexecutor.demo04;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的shutdownNow()方法的返回值
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable a = new MyRunnable("A");
        MyRunnable b = new MyRunnable("B");
        MyRunnable c = new MyRunnable("C");
        MyRunnable d = new MyRunnable("D");

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 9999, 30, TimeUnit.HOURS, new LinkedBlockingDeque<>());
        pool.execute(a);
        pool.execute(b);
        pool.execute(c);
        pool.execute(d);
        Thread.sleep(2000);
        List<Runnable> list = pool.shutdownNow();
        for (Runnable r : list) {
            MyRunnable myRunnable = (MyRunnable) r;
            System.out.println(myRunnable.getName() + " 任务未执行！");
        }
        System.out.println("main end!");
    }
}
