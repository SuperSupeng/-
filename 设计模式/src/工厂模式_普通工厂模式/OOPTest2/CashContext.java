package 工厂模式_普通工厂模式.OOPTest2;

/**
 * Created by ${super} on ${2017/5/27}.
 * 策略模式的综合应用
 */
public class CashContext {
    CashSuper cashSuper = null;
    public CashContext(CashSuper cashSuper){
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
