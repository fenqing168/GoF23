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
