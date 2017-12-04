package 工厂模式_普通工厂模式.OOPTest;

/**
 * Created by ${super} on ${2017/5/27}.
 * 简单工厂方法模式
 */
public class OperatioFactory {
    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation = new OPerationAdd();
                break;
            case "-":
                operation = new OPerationSub();
                break;
            case "*":
                operation = new OPerationMul();
                break;
            case "/":
                operation = new OPerationDiv();
                break;
        }
        return operation;
    }
}
