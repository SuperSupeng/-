package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class ForenoonState extends State {
    @Override
    public void WriteProgram(Work w) {
        if(w.getHour()<12){
            System.out.printf("当前时间：%f点 上午工作 精神百倍\n", w.getHour());
        }else{
            w.setState(new NoonState());
            w.writeProgram();
        }
    }
}
