package 工厂模式_普通工厂模式.OOPTest2;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class CashRebate extends CashSuper {

    private double rebate = 0;

    public CashRebate(double rebate){
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*rebate;
    }
}
