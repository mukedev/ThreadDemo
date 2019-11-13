package site.catyy.thread.semaphore;

public class MyThread extends Thread {
    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        System.out.println("线程" + Thread.currentThread().getName() + "启动了！");
        service.testMethod();
    }
}
