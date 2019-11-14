package site.catyy.thread.semaphore;

public class ThreadE extends Thread {
    private MyService service;

    public ThreadE(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}
