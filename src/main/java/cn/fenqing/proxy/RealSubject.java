package cn.fenqing.proxy;

/**
 * 真实主题
 * @author fenqing
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实");
    }

}
