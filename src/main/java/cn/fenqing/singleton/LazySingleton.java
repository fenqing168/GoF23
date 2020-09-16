package cn.fenqing.singleton;

/**
 * @author fenqing
 */
public class LazySingleton {

    private static volatile LazySingleton INSTANCE;

    /**
     * 私有构造器
     */
    private LazySingleton(){}

    /**
     * 获取实例
     * @return
     */
    public static synchronized LazySingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
