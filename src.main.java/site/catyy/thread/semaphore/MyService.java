package site.catyy.thread.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    volatile private Semaphore setSemaphore = new Semaphore(10);
    volatile private Semaphore getSemaphore = new Semaphore(20);
    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();
    /**
     * producePosition 含义是最多只有4个盒子存放菜品
     */
    private Object[] producePosition = new Object[4];

    /**
     * 判断盒子是否为null
     *
     * @return boolean值 true 为null,false 不为null
     */
    private boolean isEmpty() {
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] != null) {
                return false;
            }
        }
        return true;
    }

    private boolean ifFull() {
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void get() {
        try {
            getSemaphore.acquire();
            lock.lock();

            // 客官进店准备消费,如果菜盒不为空，才能消费,否则等待
            while (isEmpty()) {
                // 消费者在等待
                getCondition.await();
            }
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] != null) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "消费了菜品:" + producePosition[i]);
                    producePosition[i] = null;
                    break;
                }
            }
            // 通知厨师做菜
            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }

    public void set() {
        try {
            setSemaphore.acquire();

            lock.lock();
            // 厨师准备炒菜,如果菜盒满了就不要再炒了
            while (ifFull()) {
                setCondition.await();
            }
            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] == null) {
                    Thread.sleep(600);
                    producePosition[i] = "编码" + (int) (Math.random() * 10000);
                    System.out.println("厨师炒好了一个菜：" + producePosition[i]);
                    break;
                }
            }
            // 通知客官消费
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setSemaphore.release();
        }
    }
}
