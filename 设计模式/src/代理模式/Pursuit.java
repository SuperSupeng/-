package 代理模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Pursuit implements GiveGift {

    SchoolGirl girl;

    public Pursuit(SchoolGirl girl){
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "送你巧克力");
    }
}
