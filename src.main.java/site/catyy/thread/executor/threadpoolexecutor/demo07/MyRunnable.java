package site.catyy.thread.executor.threadpoolexecutor.demo07;

/**
 * 测试自定义自定义工厂处理异常
 *
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        String abc = null;
        abc.indexOf(0);
        System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
    }
}
