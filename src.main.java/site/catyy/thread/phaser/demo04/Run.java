package site.catyy.thread.phaser.demo04;

import java.util.concurrent.Phaser;

/**
 * 测试onAdvance()方法
 * nAdvance()作用：过了新的屏障时调用此方法
 * 注意：
 * //当 return true 时，phaser失效，后面的屏障被销毁
 * //当 return true 时，正常执行后续的phaser屏障
 *
 * @author zhangYu
 * @date 2019/11/21
 */
public class Run {

    public static void main(String[] args) {
        Phaser phaser = new Phaser(2) {
            @Override
            protected boolean onAdvance(int phase, int registeredParties) {
                System.out.println("protected boolean onAdvance(int phase, int registeredParties) 被调用！！！");
                return false;
                //当 return true 时，phaser失效，后面的屏障被销毁
                //当 return true 时，正常执行后续的phaser屏障
            }
        };
        MyService ms = new MyService(phaser);

        MyThread a = new MyThread(ms);
        a.setName("A");
        a.start();
        MyThread b = new MyThread(ms);
        b.setName("B");
        b.start();

    }
}
