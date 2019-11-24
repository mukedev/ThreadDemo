package site.catyy.thread.executor.executors.demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Executors类的方法newCachedThreadPool(ThreadFactory threadFactory)测试
 * 作用：自定义线程工厂
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory();
        ExecutorService executorService = Executors.newCachedThreadPool(myThreadFactory);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("我在运行" + System.currentTimeMillis() + " " + Thread.currentThread().getName());
            }
        });
    }
}
