package three.三点九;


import java.sql.SQLOutput;

/**
 * @author zwh
 * @version V1.0
 * @Package three.三点九
 * @date 2022/1/12 16:10
 * 基于静态内部类的单例模式实现
 */
public class StaticHolderSingleton {
    private StaticHolderSingleton(){
        System.out.println("StaticHolderSingleton init");
    }

    private static class InstanceHolder{
        //保存外部类的唯一实例
        final static StaticHolderSingleton INSTANCE  = new StaticHolderSingleton();

    }

    public static StaticHolderSingleton getInstance(){
        return InstanceHolder.INSTANCE;
    }

    public void someService(){

    }

    public static void main(String[] args) {
        StaticHolderSingleton.getInstance().someService();
    }
}
