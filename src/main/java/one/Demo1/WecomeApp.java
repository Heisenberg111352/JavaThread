package one.Demo1;

/**
 * @author zwh
 * @version V1.0
 * @Package one.Demo1
 * @date 2022/1/5 10:06
 * 1.3.1
 */
public class WecomeApp {
    public static void main(String[] args) {
        WelcomeThread welcomeThread = new WelcomeThread();
        welcomeThread.start();

        System.out.printf("main线程 %s.%n",Thread.currentThread().getName());
    }


}
