package TemplateMethod;

public class Main {
    public static void main(String[] args){
        AbstractClass a = null;
        a = new ConcreteClassA();
        a.templeteMethod();

        a = new ConcreteClassB();
        a.templeteMethod();
    }
}
