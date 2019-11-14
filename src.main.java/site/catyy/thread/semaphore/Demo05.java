package site.catyy.thread.semaphore;

/**
 * 方法availablePermits()和 drainPermits()方法使用
 * availablePermits()作用：返回此Semaphore对象中可用的许可数
 * drainPermits()作用：返回此Semaphore对象中可用的许可数,并置为0
 *
 * @author zhangYu
 */
public class Demo05 {

    public static void main(String[] args) {
        Service service = new Service();
        service.testMethod();
    }
}
