package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class RestState extends State {
    @Override
    public void WriteProgram(Work w) {
        System.out.printf("当前时间：%f点 下班回家\n", w.getHour());
    }
}
