package cn.fenqing.abstractfactory;

/**
 * @author fenqing
 */
public class App {

    public static void main(String[] args) {
        AbstractComputer abstractComputer = new DiyComputer();
        System.out.println("================================");
        System.out.println("diy电脑");
        print(abstractComputer);
        AbstractComputer abstractComputer1 = new GreenHeadComputer();
        System.out.println("================================");
        System.out.println("小白电脑");
        print(abstractComputer1);
    }

    public static void print(AbstractComputer computer){
        System.out.println(computer.getAtx().getName());
        System.out.println(computer.getAtxCooling().getName());
        System.out.println(computer.getCpu().getName());
        System.out.println(computer.getDisk().getName());
        System.out.println(computer.getGpu().getName());
        System.out.println(computer.getDisplayer().getName());
        System.out.println(computer.getCpuCooling().getName());
        System.out.println(computer.getKeyboard().getName());
        System.out.println(computer.getMemoy().getName());
        System.out.println(computer.getMouse().getName());
        System.out.println(computer.getPower().getName());
        System.out.println(computer.getMainboard().getName());
    }

}
