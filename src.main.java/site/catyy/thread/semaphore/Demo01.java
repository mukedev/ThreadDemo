package site.catyy.thread.semaphore;

/**
 * Semaphore的使用
 *
 * @author zhangYu
 * @date 2019/11/13
 */
public class Demo01 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        ThreadC threadC = new ThreadC(service);
        threadC.start();
    }
}

