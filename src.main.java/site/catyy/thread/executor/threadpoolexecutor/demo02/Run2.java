package site.catyy.thread.executor.threadpoolexecutor.demo02;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 测试ThreadPoolExecutor类的shutdown()方法
 * 作用：使当前未执行的线程继续执行，而不再添加新的任务，shutdown()方法不会阻塞
 * 如果继续添加新的任务会抛出异常！
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(7, 10, 0L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        threadPoolExecutor.execute(myRunnable);
        threadPoolExecutor.shutdown();
        threadPoolExecutor.execute(myRunnable);
        System.out.println("main end!");
    }
}
