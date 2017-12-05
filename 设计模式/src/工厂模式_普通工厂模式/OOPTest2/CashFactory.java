package 工厂模式_普通工厂模式.OOPTest2;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class CashFactory {
    public static CashSuper createCashAccept(String type){
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

}
