package cn.fenqing.proxy;

/**
 * 主题代理
 * @author fenqing
 */
public class SubjectPorxy implements Subject {

    private Subject subject;

    public SubjectPorxy(Subject subject) {
        this.subject = subject;
    }

    public void preRequest(){
        System.out.println("前");
    }

    public void postRequest(){
        System.out.println("后");
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }
}
