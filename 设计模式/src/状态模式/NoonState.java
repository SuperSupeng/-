package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class NoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour()<13){
            System.out.printf("当前时间：%f点 午休\n", w.getHour());
        }else{
            w.setState(new AfternoonState());
            w.writeProgram();
        }
    }
}
