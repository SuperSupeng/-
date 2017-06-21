package 工厂模式_多个工厂方法模式;

/**
 * Created by dell on 2017/5/27.
 */
public class MyFactory {

   public MyInterface produceOne(){
       return new MyClassOne();
   }

    public MyInterface produceTwo(){
        return new MyClassTwo();
    }
}
