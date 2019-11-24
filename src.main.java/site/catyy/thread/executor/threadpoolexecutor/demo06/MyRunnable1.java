package site.catyy.thread.executor.threadpoolexecutor.demo06;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
