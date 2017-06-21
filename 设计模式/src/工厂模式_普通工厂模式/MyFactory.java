package 工厂模式_普通工厂模式;

/**
 * Created by dell on 2017/5/27.
 */
public class MyFactory {
    public MyInterface produce(String type){
        if("one".equals(type)){
            return new MyClassOne();
        }else if("two".equals(type)) {
            return new MyClassTwo();
        }else {
            System.out.println("没有你要找的类");
            return null;
        }
    }
}
