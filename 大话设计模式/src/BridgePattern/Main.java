package BridgePattern;

public class Main {
    public static void main(String[] args){
        Abstraction abstraction = new RefindAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
