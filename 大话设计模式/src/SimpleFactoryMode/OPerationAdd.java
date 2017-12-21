package SimpleFactoryMode;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class OPerationAdd extends Operation {
    @Override
    public double getResult() {
        result = get_numberA() + get_numberB();
        return result;
    }
}
