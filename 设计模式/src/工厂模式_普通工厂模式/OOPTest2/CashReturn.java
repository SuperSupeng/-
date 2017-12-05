package 工厂模式_普通工厂模式.OOPTest2;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double moneyCondition, double moneyReturn){
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
