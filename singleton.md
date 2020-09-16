## 单例模式
* 在实例化时间过长，内存开销大的对象创建时使用，可以避免不必要的浪费，需要私有构造器，并且自己持有自己的唯一的实例
### 介绍
* 优点：
> 1. 节省内存
> 2. 避免浪费
> 3. 可以用作于资源共享
* 缺点：
> 1. 没有接口，不易扩展，需要修改源代码
> 2. 不利于调试，单例里面的代码没有执行完毕，则不能模拟创建一个新的对象
> 3. 单例模式一般写在类中，设计不当容易过于聚合，违背单一职责原则
### 实现
1. 懒汉式
    * 特点：在类加载时就会创建实例，利用jvm类加载天然单例机制
    * 优点：
        1. 不需要添加同步锁，性能优于懒汉式
    * 缺点：
        1. 在类加载的时候则需要创建对象，过多的饿汉式会使得系统启动过慢，并且浪费内存，有些对象可能不一定适用到
    ### 代码
    ```java
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
    ```
2. 饿汉式
    * 特点：在第一次使用时候会创建一个新的对象，后序使用则返回第一次创建的对象
    * 优点：
        1. 不使用则不会创建对象，避免浪费
    * 缺点：
        1. 需要加同步锁，性能开销大
    ### 代码
    ```java
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
    ```
3. 双重检验锁
    * 特点：是懒汉式的升级版，弥补了懒汉式全局加锁的性能开销
    * 优点：
        1. 支持懒加载，不使用则不会创建对象
        2. 采用第一次创建时局部加锁，后序无锁
    * 缺点：
        1. 编写逻辑相对复杂
    ### 代码
    ```java
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
    ```
4. 静态内部类
    * 特点：采用jvm机制，使用静态内部类持有实例
    * 优点：
        1. 支持懒加载，不使用则不会创建对象
        2. 无需加同步锁，也能保证线程安全
    * 缺点：
        1. 需要多编写一个类
    ### 代码
    ```java
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
    ```