package site.catyy.thread.executor.threadpoolexecutor.demo06;

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
        thread.setName("自定义工厂：" + new Date());
        return thread;
    }
}
