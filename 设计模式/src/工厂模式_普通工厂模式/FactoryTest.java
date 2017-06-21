package 工厂模式_普通工厂模式;

/**
 * Created by dell on 2017/5/27.
 */
public class FactoryTest {

    public static void main(String[] args){
        MyFactory factory = new MyFactory();
        MyInterface myInterface = factory.produce("one");
        myInterface.print();
    }
}
