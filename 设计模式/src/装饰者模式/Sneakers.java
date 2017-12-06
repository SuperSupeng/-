package 装饰者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.println("运动鞋");
        //显示父类的装扮
        super.show();
    }
}
