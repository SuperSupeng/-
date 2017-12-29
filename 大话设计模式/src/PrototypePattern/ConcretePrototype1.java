package PrototypePattern;

public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype myClone() throws CloneNotSupportedException {
        return (Prototype) this.clone();
    }
}
