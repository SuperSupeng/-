package BridgePattern;

public class RefindAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
