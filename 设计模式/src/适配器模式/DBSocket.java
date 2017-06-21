package 适配器模式;

/**德标插座实现德标接口
 * Created by ${super} on ${2017/5/27}.
 */
public class DBSocket implements DBSocketInterface {

    @Override
    public void powerWitnTwoRound() {
        System.out.println("使用两项圆头的插孔供电");
    }
}
