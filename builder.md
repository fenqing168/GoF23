[首页](../../)
## 建造者模式
* 讲一个复杂的对象一步一步构建出来
### 介绍
* 优点：
> 1. 封装性好，构建和表示分离
> 2. 扩展性好，各个具体的构造器互相独立，有利于系统的解耦
> 3. 客户端不需要知道产品的细节
* 缺点：
> 1. 产品的组成部分必须相同，这限制了使用范围
> 2. 如果产品内部变化复杂，如果产品内部发生变化，构造器也要随之修改，后期维护大
### 代码
* 建造者
```java
package cn.fenqing.builder;

/**
 * @author fenqing
 */
public class Product {

    private String partA;

    private String partB;

    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    static class Builder{
        private Product product;

        public Builder() {
            this.product = new Product();
        }

        public Builder partA(String partA){
            product.partA = partA;
            return this;
        }

        public Builder partB(String partB){
            product.partB = partB;
            return this;
        }

        public Builder partC(String partC){
            product.partC = partC;
            return this;
        }

        public Product builder(){
            return product;
        }
    }

}
```
* App
```java
package cn.fenqing.builder;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Product product = new Product.Builder().partA("A").partB("B").partC("C").builder();
        System.out.println(product.getPartA());
    }

}
```