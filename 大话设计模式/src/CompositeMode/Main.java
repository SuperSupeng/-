package CompositeMode;

public class Main {
    public static void main(String[] args){
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("leaf B"));

        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("XA"));
        composite.add(new Leaf("XB"));

        root.add(composite);

        Composite composite1 = new Composite("Composite Y");
        composite1.add(new Leaf("YA"));
        composite1.add(new Leaf("YB"));

        composite.add(composite1);

        root.add(new Leaf("Leaf C"));

        root.display(1);
    }
}
