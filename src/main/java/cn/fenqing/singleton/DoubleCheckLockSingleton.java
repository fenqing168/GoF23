package cn.fenqing.singleton;

/**
 * 双重检索
 * @author fenqing
 */
public class DoubleCheckLockSingleton {

    /**
     * 单例
     */
    private static volatile DoubleCheckLockSingleton INSTANCE;

    /**
     * 私有构造器
     */
    private DoubleCheckLockSingleton(){}

    /**
     * 获取实例
     * @return
     */
    public static DoubleCheckLockSingleton getInstance(){
        //出现线程安全问题只会在实例从0到1时会有出现，
        // 第一层if判断用于已经确定实例完成创建判断后直接返回
        if(INSTANCE == null){
            synchronized (DoubleCheckLockSingleton.class){
                //此判断用于当实例在创建和未创建的中间态，多个线程通过了第一个if判断
                //故在当前代码块保证单个线程执行，第一个创建后，则无需创建
                if(INSTANCE == null){
                    INSTANCE = new DoubleCheckLockSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
