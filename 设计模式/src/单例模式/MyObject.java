package 单例模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class MyObject {
    private static MyObject myObject = new MyObject();

    private MyObject(){

    }

    public static MyObject getInstance(){
        return myObject;
    }
}
