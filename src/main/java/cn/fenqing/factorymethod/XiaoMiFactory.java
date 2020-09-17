package cn.fenqing.factorymethod;

/**
 * @author fenqing
 */
public class XiaoMiFactory extends AbstractFactory {
    @Override
    public Product getProduct() {
        return new XiaoMiProduct();
    }
}
