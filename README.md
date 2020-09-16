# GOF23
## 1.单例模式
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
* 特点：在第一次使用时候会创建一个新的对象，后序使用则返回第一次创建的对象
* 优点：
> 1. 不使用则不会创建对象，避免浪费
* 缺点：
> 1. 需要加同步锁，性能开销大
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