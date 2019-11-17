package site.catyy.thread.cyclicbarrier.demo07;

import site.catyy.thread.semaphore.Service;

/**
 * @author zhangYu
 * @date 2019/11/17
 */
public class MyThread extends Thread {

    private MyService myService;
    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
