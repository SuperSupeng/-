package StateModel;

public class Main {
    public static void main(String[] args){
        Context context = new Context(new ConcreteA());

        context.request();
        context.request();
        context.request();
        context.request();

    }
}
