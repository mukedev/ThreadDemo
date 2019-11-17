package site.catyy.thread.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Demo06 {

    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        System.out.println("getCount1:" + cdl.getCount());
        cdl.countDown();
        System.out.println("getCount2:" + cdl.getCount());
        cdl.countDown();
        cdl.countDown();
        System.out.println("getCount3:" + cdl.getCount());
    }
}
