package site.catyy.thread.executor.executors.demo02;

import java.util.concurrent.ThreadFactory;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("定制池中的线程对象名称：" + Math.random());
        return thread;
    }
}
