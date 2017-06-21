package 工厂方法_抽象工厂方法模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class FactoryTest {

    public static void main(String[] args){
        Provider provider = new MyFactoryOne();
        MyInterface myi = provider.produce();
        myi.print();
    }
}
