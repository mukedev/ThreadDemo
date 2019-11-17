package site.catyy.thread.cyclicbarrier.demo02;

import java.util.concurrent.CyclicBarrier;

/**
 * 测试线程数大于parties数量时分批处理
 *
 * @author zhangYu
 */
public class Run {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2, new Runnable() {

            @Override
            public void run() {
                System.out.println("全部到了！");
            }
        });

        // 如果到达线程不等于parites数据量，则会一直阻塞
        MyThread[] mt = new MyThread[5];
        for (int i = 0; i < mt.length; i++) {
            mt[i] = new MyThread(cyclicBarrier);

        }
        for (int i = 0; i < mt.length; i++) {
            mt[i].start();
        }
    }
}
