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
