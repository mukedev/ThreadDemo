package site.catyy.thread.phaser.demo09;

/**
 * @author zhangYu
 * @date 2019/11/23
 */
public class MyThread extends Thread {
    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
