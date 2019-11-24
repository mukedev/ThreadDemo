package site.catyy.thread.executor.threadpoolexecutor.demo08;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(((MyRunnable) r).getUsername() + " 被拒绝执行！");
    }
}
