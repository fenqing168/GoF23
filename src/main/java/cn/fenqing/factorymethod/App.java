package cn.fenqing.factorymethod;

/**
 * @author fenqing
 */
public class App {
    public static void main(String[] args) {
        AbstractFactory factory = new XiaoMiFactory();
        Product product = factory.getProduct();
        product.call();
        AbstractFactory factory1 = new HuaweiFactory();
        Product product1 = factory1.getProduct();
        product1.call();
    }
}
