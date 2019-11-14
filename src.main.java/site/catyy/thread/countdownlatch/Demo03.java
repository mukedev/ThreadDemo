package site.catyy.thread.countdownlatch;

/**
 * 测试赛跑：各就各位(时间一到就开始）
 */
public class Demo03 {

    public static void main(String[] args) throws InterruptedException {
        Service ms = new Service();
        ThreadB[] t = new ThreadB[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = new ThreadB(ms);
            t[i].setName("线程" + (i + 1));
            t[i].start();
        }
        Thread.sleep(3000);
        ms.downMethod();
    }
}
