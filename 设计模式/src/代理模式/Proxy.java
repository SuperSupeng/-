package 代理模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Proxy implements GiveGift {

    Pursuit pursuit;

    public Proxy(SchoolGirl girl){
        pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
