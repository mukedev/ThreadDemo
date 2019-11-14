package site.catyy.thread.semaphore;

public class ThreadD extends Thread {
    private MyService service;

    public ThreadD(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
