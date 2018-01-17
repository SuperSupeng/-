package MediatorPattern;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void myNotify(String message){
        System.out.println("同事二得到信息：" + message);
    }
}
