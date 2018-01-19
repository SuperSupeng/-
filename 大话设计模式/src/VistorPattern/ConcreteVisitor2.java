package VistorPattern;

public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.printf("%s被%s访问\n", concreteElementA.getClass().getName(), this.getClass().getName());
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.printf("%s被%s访问\n", concreteElementB.getClass().getName(), this.getClass().getName());
    }
}
