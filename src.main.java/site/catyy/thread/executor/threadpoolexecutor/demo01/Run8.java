package site.catyy.thread.executor.threadpoolexecutor.demo01;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试参数关系，keepAliveTime = 0
 * A > B && A <= C  则马上创建全部任务（下面代码中的7个任务），C 、G 参数有效，不把D放入F中，D执行完任务后立即将D清除
 * F:SynchronousQueue()
 * 运行结果getPoolSize 值会变化
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run8 {
    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 8, 0L, TimeUnit.SECONDS, new SynchronousQueue<>());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println(Thread.currentThread().getName() + " run! " + System.currentTimeMillis());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);

        Thread.sleep(300);
        System.out.println("A:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("A:" + threadPoolExecutor.getPoolSize());
        System.out.println("A:" + threadPoolExecutor.getQueue().size());

        Thread.sleep(5000);
        System.out.println("B:" + threadPoolExecutor.getCorePoolSize());
        System.out.println("B:" + threadPoolExecutor.getPoolSize());
        System.out.println("B:" + threadPoolExecutor.getQueue().size());

    }
}
