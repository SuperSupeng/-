package ChainOfResponsibilityPattern;

public class ConcreteHandler3 extends Handler {
    @Override
    public void HandleRequest(int request) {
        if(request >= 20 && request < 30){
            System.out.printf("%s处理请求%s\n", this.getClass().getName(), request);
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
