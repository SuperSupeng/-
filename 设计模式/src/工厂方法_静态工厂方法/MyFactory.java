package 工厂方法_静态工厂方法;

/**
 * Created by dell on 2017/5/27.
 */
public class MyFactory {

   public static MyInterface produceOne(){
       return new MyClassOne();
   }

   public static MyInterface produceTwo(){
        return new MyClassTwo();
    }
}
