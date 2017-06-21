package 适配器模式;

/**
 * 适配器
 * Created by ${super} on ${2017/5/27}.
 */
public class SocketAdapter implements DBSocketInterface{

    private GBSocketInterface gbSocket;

    public SocketAdapter(GBSocketInterface gbSocket){
        this.gbSocket = gbSocket;
    }


    @Override
    public void powerWitnTwoRound() {
        gbSocket.powerWithThreeFlat();
    }
}
