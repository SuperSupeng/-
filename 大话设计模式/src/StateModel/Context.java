package StateModel;

public class Context {
    private State state;
    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("当前状态：" + state.getClass().getName());
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
