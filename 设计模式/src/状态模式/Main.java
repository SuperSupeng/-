package 状态模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Main {
    public static void main(String[] args){
        Work projects = new Work();
        projects.setHour(9);
        projects.writeProgram();
        projects.setHour(10);
        projects.writeProgram();
        projects.setHour(12);
        projects.writeProgram();
        projects.setHour(13);
        projects.writeProgram();
        projects.setHour(14);
        projects.writeProgram();
        projects.setHour(17);
        projects.writeProgram();
        projects.setFinish(false);
        projects.writeProgram();
        projects.setHour(19);
        projects.writeProgram();
        projects.setHour(22);
        projects.writeProgram();

    }
}
