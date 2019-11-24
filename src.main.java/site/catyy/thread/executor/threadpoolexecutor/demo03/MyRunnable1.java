package site.catyy.thread.executor.threadpoolexecutor.demo03;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable1 implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE/100; i++) {
                String str = new String();
                Math.random();
                Math.random();

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("任务没有完成，就中断了！");
                    throw new InterruptedException();
                }
            }
            System.out.println("任务完成！");
        } catch (InterruptedException e) {
            System.out.println("进入catch中断任务！");
            e.printStackTrace();
        }
    }
}
