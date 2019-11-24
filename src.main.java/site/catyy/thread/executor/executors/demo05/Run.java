package site.catyy.thread.executor.executors.demo05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试Executors类的newSingleThreadExecutor()方法
 * 作用：创建一个单一线程池
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            executorService.execute(new MyRunnable("" + (i + 1)));
        }
    }
}
