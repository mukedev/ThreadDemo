package site.catyy.thread.executor.executors.demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个根据需要创建新线程的线程池，但在可用时将重新使用以前构造的线程。 这些池通常会提高执行许多短暂异步任务的程序的性能。
 * 调用execute将重用以前构造的线程（如果可用）。 如果没有可用的线程，将创建一个新的线程并将其添加到该池中。
 * 未使用六十秒的线程将被终止并从缓存中删除。 因此，长时间保持闲置的池将不会消耗任何资源。
 * 请注意，可以使用ThreadPoolExecutor构造函数创建具有相似属性但不同详细信息的池（例如，超时参数）。
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class Run1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable1 begin" + System.currentTimeMillis());
                    Thread.sleep(1000);
                    System.out.println("A");
                    System.out.println("Runnable1 end" + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable2 begin" + System.currentTimeMillis());
                    Thread.sleep(1000);
                    System.out.println("B");
                    System.out.println("Runnable2 end" + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
