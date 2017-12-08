package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Work {
    private State current;

    public Work(){
        current = new ForenoonState();
    }

    private double hour;
    private boolean finish = false;

    public void setState(State s){
        current = s;
    }

    public boolean getFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void writeProgram(){
        current.WriteProgram(this);
    }
}
