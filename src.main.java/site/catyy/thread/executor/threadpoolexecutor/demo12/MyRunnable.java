package site.catyy.thread.executor.threadpoolexecutor.demo12;

/**
 * @author zhangYu
 * @date 2019/12/15
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("begin " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println("end " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
