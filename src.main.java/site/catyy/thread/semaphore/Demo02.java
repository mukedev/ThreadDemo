package site.catyy.thread.semaphore;

/**
 * 测试acquire(inr permits)参数 ,permits表示一次消耗几个许可
 *
 * @author zhangYu
 */
public class Demo02 {
    public static void main(String[] args) {
        Service service = new Service();

        ThreadA[] threadA = new ThreadA[10];
        for (int i = 0; i < threadA.length; i++) {
            threadA[i] = new ThreadA(service);
            threadA[i].start();
        }
    }
}
