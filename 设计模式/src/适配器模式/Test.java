package 适配器模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Test {
    public static void main(String[] args){
        DBSocketInterface dbSocket = new DBSocket();

        Hotel hotel = new Hotel(dbSocket);

        hotel.charge();
    }
}
