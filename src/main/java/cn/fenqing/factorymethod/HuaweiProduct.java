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
