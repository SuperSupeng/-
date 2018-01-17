package MediatorPattern;

public class Main {
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("吃饭喇嘛");
        colleague2.send("你要请客啊");
    }
}
