package site.catyy.thread.executor.executors.demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试Executors类的newFixedThreadPool(int nThreads)方法
 * 作用：创建一个有边界且自定义线程工厂的线程池
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3,new MyThreadFactory());
        for (int i = 0; i < 6; i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
    }
}
