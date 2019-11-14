package site.catyy.thread.semaphore;

/**
 * 测试getQueueLength() 和 hasQueuedThreads() 方法的使用
 * getQueueLength() 作用：取得等待许可的线程数
 * hasQueuedThreads() 作用：判断有没有线程在等待这个许可
 *
 * @author zhangYu
 */
public class Demo06 {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA threadA = new ThreadA(service);
        threadA.start();

        ThreadA[] threadAs = new ThreadA[5];
        for (int i = 0; i < threadAs.length; i++) {
            threadAs[i] = new ThreadA(service);
            threadAs[i].start();
        }
    }
}
