package 工厂模式_普通工厂模式.OOPTest;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class OPerationMul extends Operation {
    @Override
    public double getResult() {
        result = get_numberA() * get_numberB();
        return result;
    }
}
