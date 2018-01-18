package FlyweightPattern;

import java.util.Hashtable;
import java.util.Map;

public class FlyweightFactory {
    private Map flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

   public Flyweight getFlyweight(String key){
        return (Flyweight) flyweights.get(key);
   }
}
