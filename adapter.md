[首页](../../)
## 适配器模式
* 一个已有类的接口与现有的接口不兼容，但他的功能大致相同，重新开发成本太大
### 介绍
* 优点：
> 1. 客户端通过适配器可以透明地调用目标接口。
> 2. 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
> 3. 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。
* 缺点：
> 1. 对类适配器来说，更换适配器的实现过程比较复杂。
### 代码
* 目标
```java
package cn.fenqing.adapter;

/**
 * 目标
 * @author fenqing
 */
public interface Target {

    /**
     * 请求
     */
    void request();

}
```
* 适配器
```java
package cn.fenqing.adapter;

/**
 * 适配者
 * @author fenqing
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者代码被调用");
    }

}
```
* 适配器
```java
package cn.fenqing.adapter;

/**
 * 适配器
 * @author fenqing
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
```
* App
```java
package cn.fenqing.adapter;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
```