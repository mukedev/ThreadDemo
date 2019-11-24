package site.catyy.thread.executor.threadpoolexecutor.demo07;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("我的新名字：" + new Date());
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("自定义处理异常启用：" + t.getName() + " " + e.getMessage());
                e.printStackTrace();
            }
        });
        return thread;
    }
}
