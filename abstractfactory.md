[首页](../../)
## 抽象工厂模式
* 抽象工厂是工厂方法的升级版，工厂方法只能生产一个级别的产品，抽象工厂可以生产一个产品簇
### 介绍
* 优点：
> 1. 添加一个产品簇时，无需修改源代码，只需要添加新的工厂，满足开闭原则
* 缺点：
> 1. 如果添加一个产品时，需要修改全部工厂
### 实现
* 特点：只复制基本类型的值，引用类型值引用复制
* 优点：
    1. 编写简单
* 缺点：
    1. 无法实现深度复制，导致引用对象依然是同一个，修改会影响到别的对象
### 代码
* 主板
```java
package cn.fenqing.abstractfactory;

/**
 * 主板
 * @author fenqing
 */
public abstract class Mainboard {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 华擎主板
 * @author fenqing
 */
public class AsRockMainboard extends Mainboard {

    @Override
    public String getName() {
        return "华擎主板";
    }

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 华硕主板
 * @author fenqing
 */
public class AsusMainBoard extends Mainboard {
    @Override
    public String getName() {
        return "华硕主板";
    }
}
```
* cpu
```java
package cn.fenqing.abstractfactory;

/**
 * 风扇
 * @author fenqing
 */
public abstract class Cpu {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * amd cpu
 * @author fenqing
 */
public class AmdCup extends Cpu {
    @Override
    public String getName() {
        return "AMD CPU";
    }
}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 英特尔Cpu
 * @author fenqing
 */
public class IntelCup extends Cpu {
    @Override
    public String getName() {
        return "英特尔CUP";
    }
}
```
* 显卡
```java
package cn.fenqing.abstractfactory;

/**
 * 显卡
 * @author fenqing
 */
public abstract class Gpu {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * amd 显卡
 * @author fenqing
 */
public class AmdGpu extends Gpu {
    @Override
    public String getName() {
        return "amd 显卡";
    }
}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 英伟达显卡
 * @author fenqing
 */
public class NvidiaGpu extends Gpu {
    @Override
    public String getName() {
        return "英伟达显卡";
    }
}
```
* 电源
```java
package cn.fenqing.abstractfactory;

/**
 * 电源
 * @author fenqing
 */
public abstract class Power {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 杂牌电源
 * @author fenqing
 */
public class CheapPower extends Power {

    @Override
    public String getName() {
        return "杂牌电源";
    }

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 长城电源
 * @author fenqing
 */
public class GreatPower extends Power {
    @Override
    public String getName() {
        return "长城电源";
    }
}
```
* 机箱
```java
package cn.fenqing.abstractfactory;

/**
 * 机箱
 * @author fenqing
 */
public abstract class Atx {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 爱国者机箱
 * @author fenqing
 */
public class AigoAtx extends Atx {

    @Override
    public String getName() {
        return "爱国者机箱";
    }
}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 长城机箱
 * @author fenqing
 */
public class GreatAtx extends Atx {

    @Override
    public String getName() {
        return "长城机箱";
    }
}

```
* 显示器
```java
package cn.fenqing.abstractfactory;

/**
 * 显示器
 * @author fenqing
 */
public abstract class Displayer {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * aoc显示器
 * @author fenqing
 */
public class AocDisplayer extends Displayer {
    @Override
    public String getName() {
        return "Aoc 显示器";
    }
}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 三星显示器
 * @author fenqing
 */
public class SamsungDisplayer extends Displayer {
    @Override
    public String getName() {
        return "三星显示器";
    }
}

```
* 硬盘
```java
package cn.fenqing.abstractfactory;

/**
 * 硬盘
 * @author fenqing
 */
public abstract class Disk {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 *
 * @author fenqing
 */
public class HdDisk extends Disk {
    @Override
    public String getName() {
        return "机械硬盘";
    }
}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 固态硬盘
 * @author fenqing
 */
public class SsDisk extends Disk {
    @Override
    public String getName() {
        return "固态硬盘";
    }
}

```
* 鼠标
```java
package cn.fenqing.abstractfactory;

/**
 * 鼠标
 * @author fenqing
 */
public abstract class Mouse {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 杂牌鼠标
 * @author fenqing
 */
public class CheapMouse extends Mouse {

    @Override
    public String getName() {
        return "杂牌鼠标";
    }

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 罗技鼠标
 * @author fenqing
 */
public class LogitechMouse extends Mouse {

    @Override
    public String getName() {
        return "罗技鼠标";
    }

}

```
* 内存
```java
package cn.fenqing.abstractfactory;

/**
 * 内存
 * @author fenqing
 */
public abstract class Memoy {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 杂牌内存
 * @author fenqing
 */
public class CheapMemoy extends Memoy {

    @Override
    public String getName() {
        return "杂牌内存";
    }

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 金士顿内存
 * @author fenqing
 */
public class KingstonMemoy extends Memoy {
    @Override
    public String getName() {
        return "金士顿内存";
    }
}
```
```java
package cn.fenqing.abstractfactory;

/**
 * 三星内存
 * @author fenqing
 */
public class SamsungMenoy extends Memoy {
    @Override
    public String getName() {
        return "三星内存";
    }
}
```
* 机箱风扇
```java
package cn.fenqing.abstractfactory;

/**
 * 机箱风扇
 * @author fenqing
 */
public abstract class AtxCooling {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 爱国者机箱风扇
 * @author fenqing
 */
public class AigoAtxCooling extends AtxCooling {
    @Override
    public String getName() {
        return "爱国者机箱风扇";
    }
}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 鑫谷机箱风扇
 * @author fenqing
 */
public class SegotepAtxCooling extends AtxCooling {
    @Override
    public String getName() {
        return "鑫谷机箱风扇";
    }
}

```
* 键盘
```java
package cn.fenqing.abstractfactory;

/**
 * 键盘
 * @author fenqing
 */
public abstract class Keyboard {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 杂牌键盘
 * @author fenqing
 */
public class CheapKeyboard extends Keyboard {

    @Override
    public String getName() {
        return "杂牌键盘";
    }

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 罗技键盘
 * @author fenqing
 */
public class LogitechKeyboard extends Keyboard {

    @Override
    public String getName() {
        return "罗技键盘";
    }

}

```
* cpu散热
```java
package cn.fenqing.abstractfactory;

/**
 * cpu风扇
 * @author fenqing
 */
public abstract class CpuCooling {

    /**
     * 获取名称
     * @return
     */
    public abstract String getName();

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 风冷散热
 * @author fenqing
 */
public class AirCooling extends CpuCooling {

    @Override
    public String getName() {
        return "风冷散热";
    }

}

```
```java
package cn.fenqing.abstractfactory;

/**
 * 水冷散热
 * @author fenqing
 */
public class WaterCpuCooling extends CpuCooling{

    @Override
    public String getName() {
        return "水冷散热";
    }

}

```
* 电脑工厂
```java
package cn.fenqing.abstractfactory;

/**
 * @author fenqing
 */
public abstract class AbstractComputer {

    /**
     * 获取机箱
     * @return
     */
    public abstract Atx getAtx();

    /**
     * 获取机箱风扇
     * @return
     */
    public abstract AtxCooling getAtxCooling();

    /**
     * 获取CPU
     * @return
     */
    public abstract Cpu getCpu();

    /**
     * 获取硬盘
     * @return
     */
    public abstract Disk getDisk();

    /**
     * 获取显卡
     * @return
     */
    public abstract Gpu getGpu();

    /**
     * 获取显示器
     * @return
     */
    public abstract Displayer getDisplayer();

    /**
     * 获取电源
     * @return
     */
    public abstract Power getPower();

    /**
     * 获取内存
     * @return
     */
    public abstract Memoy getMemoy();

    /**
     * 获取Cpu风扇
     * @return
     */
    public abstract CpuCooling getCpuCooling();

    /**
     * 获取主板
     * @return
     */
    public abstract Mainboard getMainboard();

    /**
     * 获取鼠标
     * @return
     */
    public abstract Mouse getMouse();

    /**
     * 获取键盘
     * @return
     */
    public abstract Keyboard getKeyboard();

}

```
* diy电脑工厂
```java
package cn.fenqing.abstractfactory;

/**
 * diy电脑
 * @author fenqing
 */
public class DiyComputer extends AbstractComputer {
    @Override
    public Atx getAtx() {
        return new AigoAtx();
    }

    @Override
    public AtxCooling getAtxCooling() {
        return new AigoAtxCooling();
    }

    @Override
    public Cpu getCpu() {
        return new IntelCup();
    }

    @Override
    public Disk getDisk() {
        return new SsDisk();
    }

    @Override
    public Gpu getGpu() {
        return new NvidiaGpu();
    }

    @Override
    public Displayer getDisplayer() {
        return new AocDisplayer();
    }

    @Override
    public Power getPower() {
        return new GreatPower();
    }

    @Override
    public Memoy getMemoy() {
        return new SamsungMenoy();
    }

    @Override
    public CpuCooling getCpuCooling() {
        return new WaterCpuCooling();
    }

    @Override
    public Mainboard getMainboard() {
        return new AsusMainBoard();
    }

    @Override
    public Mouse getMouse() {
        return new LogitechMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new LogitechKeyboard();
    }
}

```
* 小白电脑工厂
```java
package cn.fenqing.abstractfactory;

/**
 * 小白电脑
 * @author fenqing
 */
public class GreenHeadComputer extends AbstractComputer {

    @Override
    public Atx getAtx() {
        return new GreatAtx();
    }

    @Override
    public AtxCooling getAtxCooling() {
        return new SegotepAtxCooling();
    }

    @Override
    public Cpu getCpu() {
        return new AmdCup();
    }

    @Override
    public Disk getDisk() {
        return new HdDisk();
    }

    @Override
    public Gpu getGpu() {
        return new AmdGpu();
    }

    @Override
    public Displayer getDisplayer() {
        return new SamsungDisplayer();
    }

    @Override
    public Power getPower() {
        return new CheapPower();
    }

    @Override
    public Memoy getMemoy() {
        return new KingstonMemoy();
    }

    @Override
    public CpuCooling getCpuCooling() {
        return new AirCooling();
    }

    @Override
    public Mainboard getMainboard() {
        return new AsRockMainboard();
    }

    @Override
    public Mouse getMouse() {
        return new CheapMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new CheapKeyboard();
    }
}

```
* App
```java
package cn.fenqing.abstractfactory;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        AbstractComputer abstractComputer = new DiyComputer();
        System.out.println("================================");
        System.out.println("diy电脑");
        print(abstractComputer);
        AbstractComputer abstractComputer1 = new GreenHeadComputer();
        System.out.println("================================");
        System.out.println("小白电脑");
        print(abstractComputer1);
    }

    public static void print(AbstractComputer computer){
        System.out.println(computer.getAtx().getName());
        System.out.println(computer.getAtxCooling().getName());
        System.out.println(computer.getCpu().getName());
        System.out.println(computer.getDisk().getName());
        System.out.println(computer.getGpu().getName());
        System.out.println(computer.getDisplayer().getName());
        System.out.println(computer.getCpuCooling().getName());
        System.out.println(computer.getKeyboard().getName());
        System.out.println(computer.getMemoy().getName());
        System.out.println(computer.getMouse().getName());
        System.out.println(computer.getPower().getName());
        System.out.println(computer.getMainboard().getName());
    }

}

```