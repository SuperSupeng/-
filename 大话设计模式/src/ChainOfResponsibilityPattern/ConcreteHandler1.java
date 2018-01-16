package ChainOfResponsibilityPattern;

public class ConcreteHandler1 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request >= 0 && request < 10){
            System.out.printf("%s处理请求%s\n", this.getClass().getName(), request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
