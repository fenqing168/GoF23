package cn.fenqing.builder;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Product product = new Product.Builder().partA("A").partB("B").partC("C").builder();
        System.out.println(product.getPartA());
    }

}
