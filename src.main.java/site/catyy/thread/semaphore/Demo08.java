package site.catyy.thread.semaphore;

/**
 * @author zhangYu
 * @program ThreadDemo
 * @description 方法tryAcquire(), ryAcquire(int permits),ryAcquire(long timeout, TimeUnit unit)和 ryAcquire(int permits, long timeout, TimeUnit unit)的使用
 * tryAcquire()作用： 尝试获取一个许可，获取不到返回false
 * ryAcquire(int permits) 作用：尝试获取permits个许可，获取不到返回false
 * ryAcquire(long timeout, TimeUnit unit) 作用：在给定的时间内未获取到许可，返回false
 * ryAcquire(int permits, long timeout, TimeUnit unit) 作用：在给定的时间内未获取到permits个许可，返回false
 * @create 2019-11-14 12:36
 **/
public class  Demo08 {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }

}
