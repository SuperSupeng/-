package StateModel;

public class ConcreteA extends State {
    @Override
    public void handle(Context context) {
        //设置A的下一个状态为B
        context.setState(new ConcreteB());
    }
}
