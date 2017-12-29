package PrototypePattern;

public class Main {
    public static void main(String[] args){
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = null;
        try {
            c1 = (ConcretePrototype1) p1.myClone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(c1.getId());
    }
}
