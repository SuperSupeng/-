package 工厂方法_抽象工厂方法模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class MyFactoryTwo implements Provider {

    @Override
    public MyInterface produce() {
        return new MyClassTwo();
    }
    
}

