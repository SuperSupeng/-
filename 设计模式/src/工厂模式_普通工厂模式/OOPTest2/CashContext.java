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

    /*
    策略模式与简单工厂模式的综合应用
    public static CashSuper CashContext(String type){
        CashSuper cashSuper = null;
        switch (type){
            case "正常收费":
                cashSuper = new CashNormal();
                break;
            case "满300返100":
                cashSuper = new CashReturn(300,100);
                break;
            case "打八折":
                cashSuper = new CashRebate(0.8);
                break;
        }
        return cashSuper;
    }
 */

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
