package 建造者模式;

/**
 * 针对不同的逻辑，具体化对象的各个部分的创建。在建造完成后提供产品的实例。
 * Created by ${super} on ${2017/5/27}.
 */
public class ManBuilder implements PersonBuilder{

    Person person;

    public ManBuilder(){
        person = new Person();
    }


    @Override
    public void buildHead() {
        person.setHead("建造张斯博的小脑瓜");
    }

    @Override
    public void buildBody() {
        person.setBody("建造张斯博的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造张斯博的脚丫");
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
