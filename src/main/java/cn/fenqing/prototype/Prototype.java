package cn.fenqing.prototype;


/**
 * @author fenqing
 */
public class Prototype implements Cloneable {

    private Integer id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
