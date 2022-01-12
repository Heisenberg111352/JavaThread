package three.三点九;

/**
 * @author zwh
 * @version V1.0
 * @Package three.三点九
 * @date 2022/1/12 15:55
 *
 * 简单加锁实现单例模式
 */
public class SimpleMutithreadSingleton {
    private static SimpleMutithreadSingleton instance =null;

    /**私有构造器使其他类无法直接通过new创建该类的实例 */
    private SimpleMutithreadSingleton(){
        //什么也不做
    }

    /**创建并返回该类的唯一实例
     * 即只有方法被调用时该类的唯一实例才会被创建
     * */
    public static SimpleMutithreadSingleton getInstance(){
        synchronized (SimpleMutithreadSingleton.class){
            if (null==instance){
                instance = new SimpleMutithreadSingleton();
            }
        }
        return instance;
    }

    public void someService(){

    }
}
