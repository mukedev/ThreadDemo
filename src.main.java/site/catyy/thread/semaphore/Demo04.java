package site.catyy.thread.semaphore;

/**
 * 方法acquireUninterruptibly() 的使用
 * 作用：使等待进入acquire()方法的线程不允许被中断
 *
 * @author zhangYu
 */
public class Demo04 {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(1000);
        threadB.interrupt();
        System.out.println("main 中断了B" );
    }

}
