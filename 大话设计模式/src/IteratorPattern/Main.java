package IteratorPattern;

public class Main {


    public static void main(String[] args){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.insert(0, new Object());
        aggregate.insert(1, new Object());
        aggregate.insert(2, new Object());
        aggregate.insert(3, new Object());
        aggregate.insert(4, new Object());
        aggregate.insert(5, new Object());

        Iterator iterator = new ConcreteIterator(aggregate);
        Object item = iterator.first();
        while(!iterator.isDone()){
            System.out.println(item);
            item = iterator.next();
        }
    }
}
