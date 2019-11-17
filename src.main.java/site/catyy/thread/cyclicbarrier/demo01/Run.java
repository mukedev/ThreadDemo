package site.catyy.thread.cyclicbarrier.demo01;

import java.util.concurrent.CyclicBarrier;

/**
 * 测试CyclicBarrier()的使用
 *
 * @author zhangYu
 */
public class Run {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {

            @Override
            public void run() {
                System.out.println("全部到了！");
            }
        });

        MyThread[] mt = new MyThread[5];
        for (int i = 0; i < mt.length; i++) {
            mt[i] = new MyThread(cyclicBarrier);
            mt[i].start();
        }
    }
}
