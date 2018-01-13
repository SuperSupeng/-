package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getSize(){
        return items.size();
    }

    public void insert(int index, Object value){
        items.add(index, value);
    }

    public Object getItem(int index){
        return items.get(index);
    }
}
