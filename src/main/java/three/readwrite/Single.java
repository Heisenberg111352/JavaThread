package three.readwrite;

/**
 * @author zwh
 * @version V1.0
 * @Package three.readwrite
 * @date 2022/1/12 15:44
 */
/**单线程单例模式 */
public class Single {
    //保存该类的唯一实例
    private static Single instance=null;

    //省略实例变量声明
    /**
     * 私有构造器使其他类无法直接通过new创建改类的实例
     * */
    private Single(){
        //什么也不做
    }

    /**
     * 创建并返回该类的唯一实例
     * 即只有该方法被调用是该类的唯一实例才会被创建
     * */
    public static Single getInstance(){
        if (null==instance){
             instance = new Single();
        }
        return instance;
    }

    public void someService(){

    }
}
