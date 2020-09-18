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
