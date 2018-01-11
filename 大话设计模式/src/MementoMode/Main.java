package MementoMode;

public class Main {
    public static void main(String[] args){
        Originator originator = new Originator();
        //初始状态为on
        originator.setState("On");
        originator.show();

        //保存状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //修改状态
        originator.setState("Off");
        originator.show();

        //恢复状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
