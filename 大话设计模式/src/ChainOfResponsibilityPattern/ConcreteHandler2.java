package ChainOfResponsibilityPattern;

public class ConcreteHandler2 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.printf("%s处理请求%s\n", this.getClass().getName(), request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
