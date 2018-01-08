package StateModel;

public class ConcreteB extends State {
    @Override
    public void handle(Context context) {
        //设置A的下一个状态为A
        context.setState(new ConcreteA());
    }
}
