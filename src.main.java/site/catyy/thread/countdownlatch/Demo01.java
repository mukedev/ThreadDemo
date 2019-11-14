package site.catyy.thread.countdownlatch;

/**
 * 测试CountDownLatch类的使用
 *
 * @author zhangYu
 */
public class Demo01 {

    public static void main(String[] args) throws InterruptedException {
        MyService ms = new MyService();
        MyThread mt = new MyThread(ms);
        mt.start();
        Thread.sleep(2000);
        ms.downMethod();
    }
}
