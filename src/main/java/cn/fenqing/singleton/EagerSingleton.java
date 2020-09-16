package cn.fenqing.singleton;

/**
 * 饿汉式
 * @author fenqing
 */
public class EagerSingleton {

    /**
     * 实例
     */
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * 私有构造器
     */
    private EagerSingleton(){}

    /**
     * 获取实例
     * @return
     */
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
