package 工厂方法_静态工厂方法;

/**
 * Created by dell on 2017/5/27.
 */
public class FactoryTest {

    public static void main(String[] args){
        MyInterface myInterface = MyFactory.produceOne();
        myInterface.print();
    }
}
