package site.catyy.thread.executor.threadpoolexecutor.demo17;

/**
 * @author zhangYu
 * @date 2019/12/15
 */
public class MyRunnable implements Runnable {

    private String username;

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
        System.out.println(username);
    }
}
