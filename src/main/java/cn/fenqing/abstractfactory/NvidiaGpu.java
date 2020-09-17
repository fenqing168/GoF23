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
