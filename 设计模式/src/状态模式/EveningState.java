package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class EveningState extends State{
    @Override
    public void WriteProgram(Work w) {
        if(w.getFinish()){
            w.setState(new RestState());
            w.writeProgram();
        }else{
            if(w.getHour()<21){
                System.out.printf("当前时间：%f点 加班\n", w.getHour());
            }else{
                w.setState(new SleepingState());
                w.writeProgram();
            }
        }
    }
}
