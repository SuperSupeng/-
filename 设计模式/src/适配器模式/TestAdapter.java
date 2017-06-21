package 适配器模式;

/**
 * 适配器测试
 * Created by ${super} on ${2017/5/27}.
 */
public class TestAdapter {

    public static void main(String[] args){
        //去德国旅游，带的充电器是国标的（将GBSocket看成是充电器）
        GBSocketInterface gbSocket = new GBSocket();
        //来到德国后找到一家宾馆住下（这个宾馆还是使用德国标准的插口）
        Hotel hotel = new Hotel();
        //由于没法充电，需要适配器，将充电器插在适配器上
        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);
        //再将适配器插入宾馆的插座上
        hotel.setSocket(socketAdapter);
        //在宾馆进行充电
        hotel.charge();
    }
}
