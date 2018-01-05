package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new LinkedList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detech(Observer observer){
        observers.remove(observer);
    }

    public void Notify(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
