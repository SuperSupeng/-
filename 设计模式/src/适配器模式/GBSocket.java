package 适配器模式;

/**
 * 中国插座实现国标接口
 * Created by ${super} on ${2017/5/27}.
 */
public class GBSocket implements GBSocketInterface {
    @Override
    public void powerWithThreeFlat() {
        System.out.println("使用三项扁头插孔供电");
    }
}
