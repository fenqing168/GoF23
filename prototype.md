[首页](../../)
## 原型模式
* 原型模式是从二进制内存直接复制一份来达成创建新对象的目的，并不会new，节省cpu负担
### 介绍
* 优点：
> 1. java自带的原型模式基于二进制的复制，比new性能优良
> 2. 源对象可以当做一个备份，相当于实现了撤销操作
* 缺点：
> 1. 每一个类都需要编写clone方法
> 2. clone方法处于类的内部，如果需要修改逻辑，需要改变源代码，违背开闭原则
> 3. 如果需要深克隆，则需要编写复杂的嵌套，并且每一个类都需要实现克隆
### 实现
1. 浅克隆
    * 特点：只复制基本类型的值，引用类型值引用复制
    * 优点：
        1. 编写简单
    * 缺点：
        1. 无法实现深度复制，导致引用对象依然是同一个，修改会影响到别的对象
    ### 代码
    ```java
    /**
     * @author fenqing
     */
    package cn.fenqing.prototype;
    
    
    /**
     * @author fenqing
     */
    public class Prototype implements Cloneable {
    
        private Integer id;
    
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
    ```
2. 深克隆
    * 特点：相比浅克隆，深克隆会不断递归往下克隆
    * 优点：
        1. 克隆更彻底
    * 缺点：
        1. 代码相对复杂