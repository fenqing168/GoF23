[首页](../../)
## 工厂方法模式模式
* 创建产品时无需关注创建的过程，只需要知道工厂名，使用工厂来得到产品
### 介绍
* 优点：
> 1. 对于复杂的创建过程，用户无需关注，只需调用工厂方法
> 2. 符合开闭原则，如果有新的产品只需要添加新的工厂即可
* 缺点：
> 1. 每增加一个产品就需要添加一个工厂类，增加系统复杂度
### 实现
* 特点：需要抽象工厂，具体工厂，抽象产品，具体产品
* 抽象工厂
```java
package cn.fenqing.factorymethod;

/**
 * @author fenqing
 */
public abstract class AbstractFactory {

    public abstract Product getProduct();

}
```
* 具体工厂
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public class HuaweiFactory extends AbstractFactory {
   @Override
   public Product getProduct() {
       return new HuaweiProduct();
   }
}
```
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public class XiaoMiFactory extends AbstractFactory {
   @Override
   public Product getProduct() {
       return new XiaoMiProduct();
   }
}
```
* 抽象产品
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public abstract class Product {

  /**
   * 打电话
   */
  public abstract void call();

}
```
* 具体产品
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public class HuaweiProduct extends Product {
  @Override
  public void call() {
      System.out.println("华为手机打电话");
  }
}
```
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public class XiaoMiProduct extends Product {
  @Override
  public void call() {
      System.out.println("小米手机打电话");
  }
}
```
* App
```java
package cn.fenqing.factorymethod;

/**
* @author fenqing
*/
public class App {
  public static void main(String[] args) {
      AbstractFactory factory = new XiaoMiFactory();
      Product product = factory.getProduct();
      product.call();
      AbstractFactory factory1 = new HuaweiFactory();
      Product product1 = factory1.getProduct();
      product1.call();
  }
}
```