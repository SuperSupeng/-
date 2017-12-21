package SimpleFactoryMode;
public class OperationFactory {
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
