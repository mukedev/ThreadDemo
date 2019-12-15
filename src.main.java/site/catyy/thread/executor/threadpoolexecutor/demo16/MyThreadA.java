package site.catyy.thread.executor.threadpoolexecutor.demo16;

import javax.sound.midi.Soundbank;

/**
 * @author zhangYu
 * @date 2019/12/15
 */
public class MyThreadA extends Thread {

    @Override
    public void run() {
        try {
            System.out.println(" begin " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" end " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
