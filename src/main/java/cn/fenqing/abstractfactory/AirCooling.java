package cn.fenqing.abstractfactory;

/**
 * 风冷散热
 * @author fenqing
 */
public class AirCooling extends CpuCooling {

    @Override
    public String getName() {
        return "风冷散热";
    }

}
