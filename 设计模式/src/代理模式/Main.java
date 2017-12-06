package 代理模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Main {
    public static void main(String[] args){
        SchoolGirl girl = new SchoolGirl();
        girl.setName("小博");

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveChocolate();
        proxy.giveFlowers();
    }
}
