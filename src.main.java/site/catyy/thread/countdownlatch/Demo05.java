package site.catyy.thread.countdownlatch;

/**
 * 测试await(long time, TimeUnit unit)
 *
 * @author zhangYu
 */
public class Demo05 {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadB[] threadBS = new ThreadB[3];
        for (int i = 0; i < threadBS.length; i++) {
            threadBS[i] = new ThreadB(service);
        }
        for (int i = 0; i < threadBS.length; i++) {
            threadBS[i].start();
        }
    }

}
