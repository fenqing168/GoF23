package cn.fenqing.proxy;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        Subject subject = new RealSubject();
        subject = new SubjectPorxy(subject);
        subject.request();
    }

}
