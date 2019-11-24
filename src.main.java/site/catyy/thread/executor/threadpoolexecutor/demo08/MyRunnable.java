package site.catyy.thread.executor.threadpoolexecutor.demo08;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable implements Runnable {
    private String username;

    public String getUsername() {
        return username;
    }

    public MyRunnable(String username) {
        super();
        this.username = username;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
