package 适配器模式;

/**
 * 德国旅馆
 * Created by ${super} on ${2017/5/27}.
 */
public class Hotel {
    private DBSocketInterface dbSocket;

    public Hotel(){

    }

    public Hotel(DBSocketInterface dbSocket){
        this.dbSocket = dbSocket;
    }

    public void setSocket(DBSocketInterface dbSocket){
        this.dbSocket = dbSocket;
    }

    //旅馆中一个充电功能
    public void charge(){
        //使用德标插口充电
        dbSocket.powerWitnTwoRound();
    }
}
