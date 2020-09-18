[首页](../../)
## 代理模式
* 将真实访问对象隔离开，多一层对象间接调用真实对象  
### 介绍
* 优点：
> 1. 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
> 2. 代理对象可以扩展目标对象的功能；
> 3. 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度，增加了程序的可扩展性
* 缺点：
> 1. 代理模式会造成系统设计中类的数量增加
> 2. 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
> 3. 增加了系统的复杂度；
### 代码
* 主题
```java
package cn.fenqing.proxy;

/**
 * 主题
 * @author fenqing
 */
public interface Subject {

    /**
     * 请求
     */
    void request();

}
```
* 真实主题
```java
package cn.fenqing.proxy;

/**
 * 真实主题
 * @author fenqing
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实");
    }

}

```
* 主题代理
```java
package cn.fenqing.proxy;

/**
 * 主题代理
 * @author fenqing
 */
public class SubjectPorxy implements Subject {

    private Subject subject;

    public SubjectPorxy(Subject subject) {
        this.subject = subject;
    }

    public void preRequest(){
        System.out.println("前");
    }

    public void postRequest(){
        System.out.println("后");
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }
}
```
* App
```java
package cn.fenqing.proxy;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        subject = new SubjectPorxy(subject);
        subject.request();
    }

}
```