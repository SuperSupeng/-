package MediatorPattern;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void myNotify(String message){
        System.out.println("同事一得到信息：" + message);
    }
}
