package site.catyy.thread.executor.threadpoolexecutor.demo14;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void run() {

        try {
            System.out.println(" begin " + username + " " + System.currentTimeMillis());
            Thread.sleep(1000);
            System.out.println(" end " + username + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
