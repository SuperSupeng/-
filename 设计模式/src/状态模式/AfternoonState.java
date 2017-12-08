package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class AfternoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour()<17){
            System.out.printf("当前时间：%f点 下午状态不错\n", w.getHour());
        }else{
            w.setState(new EveningState());
            w.writeProgram();
        }
    }
}
