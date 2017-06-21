package 工厂模式_多个工厂方法模式;

/**
 * Created by dell on 2017/5/27.
 */
public class FactoryTest {

    public static void main(String[] args){

        MyFactory factory = new MyFactory();
        MyInterface myInterface = factory.produceOne();
        myInterface.print();
    }
}
