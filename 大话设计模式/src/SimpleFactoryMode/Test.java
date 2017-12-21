package SimpleFactoryMode;


public class Test {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperate("+");
        operation.set_numberA(1);
        operation.set_numberB(2);
        System.out.println(operation.getResult());
    }
}
