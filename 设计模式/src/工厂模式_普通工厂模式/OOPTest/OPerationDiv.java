package 工厂模式_普通工厂模式.OOPTest;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class OPerationDiv extends Operation {
    @Override
    public double getResult() {
        if(get_numberB() == 0){
            System.out.println("除数不能为0");
            return 0;
        }else{
            result = get_numberA() / get_numberB();
            return result;
        }
    }
}
