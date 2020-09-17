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
