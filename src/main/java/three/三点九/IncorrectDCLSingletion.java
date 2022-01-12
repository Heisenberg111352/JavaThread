package three.三点九;

/**
 * @author zwh
 * @version V1.0
 * @Package three.三点九
 * @date 2022/1/12 16:00
 */
/**基于双重检查锁定的错误单例模式实现   */
public class IncorrectDCLSingletion {
    private static IncorrectDCLSingletion  instance =null;

    /**正确 */
    //private static volatile  IncorrectDCLSingletion instance;

    private IncorrectDCLSingletion(){

    }

    public static IncorrectDCLSingletion getInstance(){
        if (null==instance){
            synchronized (IncorrectDCLSingletion.class){
                if (null==instance){
                  instance = new IncorrectDCLSingletion();
                }
            }
        }
        return instance;
    }

    public void someService(){

    }
}
