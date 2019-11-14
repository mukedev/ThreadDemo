package site.catyy.thread.semaphore;

/**
 * 公平与非公平信号量测试Semaphore对象默认是非公平状态
 * 所谓的公平不是真正意义上的公平
 *
 * @author zhangYu
 */
public class Demo07 {

    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] t = new MyThread[5];
        for (int i = 0; i < t.length; i++) {
            t[i] = new MyThread(service);
            t[i].start();
        }
    }

}
