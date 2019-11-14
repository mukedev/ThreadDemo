package site.catyy.thread.semaphore;

public class Demo09 {

    public static void main(String[] args) {
        MyService service = new MyService();
        int length = 20;
        ThreadD[] threadD = new ThreadD[length];
        ThreadE[] threadE = new ThreadE[length];

        for (int i = 0; i < length; i++) {
            threadD[i] = new ThreadD(service);
            threadE[i] = new ThreadE(service);
        }
        for (int i = 0; i < length; i++) {
            threadD[i].start();
            threadE[i].start();
        }
    }
}
