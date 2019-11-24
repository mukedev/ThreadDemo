package site.catyy.thread.executor.executors.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
        Thread.sleep(3000);
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
        // 结果存在相同线程名，说明线程对象可复用
    }
}
