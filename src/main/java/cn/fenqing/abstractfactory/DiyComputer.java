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
