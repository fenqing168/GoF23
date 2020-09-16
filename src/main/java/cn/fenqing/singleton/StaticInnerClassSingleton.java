package cn.fenqing.singleton;

/**
 * 静态内部类
 * @author fenqing
 */
public class StaticInnerClassSingleton {

    /**
     * 静态内部类
     */
    private static final class StaticInner{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    /**
     * 私有构造器
     */
    private StaticInnerClassSingleton(){}

    /**
     * 获取实例
     * @return
     */
    public static StaticInnerClassSingleton getInstance(){
        return StaticInner.INSTANCE;
    }

}
