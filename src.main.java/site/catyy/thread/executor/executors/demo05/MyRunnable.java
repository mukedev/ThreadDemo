package site.catyy.thread.executor.executors.demo05;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable implements Runnable {
    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " username = " + username + " " + System.currentTimeMillis());
    }
}
