package site.catyy.thread.executor.threadpoolexecutor.demo04;

/**
 * @author zhangYu
 * @date 2019/11/24
 */
public class MyRunnable implements Runnable {
    private String name;

    public String getName() {
        return name;
    }

    public MyRunnable(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < Integer.MAX_VALUE / 100; i++) {
            String str = new String();
            Math.random();
            Math.random();
            Math.random();

        }
        System.out.println(Thread.currentThread().getName() + "任务完成！");
    }
}
