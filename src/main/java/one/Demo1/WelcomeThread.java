package one.Demo1;

/**
 * @author zwh
 * @version V1.0
 * @Package one.Demo1
 * @date 2022/1/5 10:08
 */
public class WelcomeThread extends  Thread {
    @Override
    public void run() {
        System.out.printf("2.Welcome I m %s.%n",Thread.currentThread().getName());
    }
}
