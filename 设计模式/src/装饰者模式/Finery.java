package 装饰者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 * 衣服的基类，所有衣服都继承该类
 */
public class Finery extends Person {
    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
