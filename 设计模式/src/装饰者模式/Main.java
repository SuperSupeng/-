package 装饰者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Main {

    public static void main(String[] args){
        Person p = new Person("小张");
        System.out.println("第一种装扮");

        Sneakers sneakers = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts ts = new TShirts();

        sneakers.decorate(p);
        kk.decorate(sneakers);
        ts.decorate(kk);
        ts.show();

    }
}
