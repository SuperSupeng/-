package 工厂模式_普通工厂模式.OOPTest;

/**
 * Created by ${super} on ${2017/5/27}.
 * 测试类
 */
public class Test {
    public static void main(String[] args){
        Operation operation = OperatioFactory.createOperate("+");
        operation.set_numberA(1);
        operation.set_numberB(2);
        System.out.println(operation.getResult());
    }
}
