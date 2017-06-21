package 建造者模式;

/**
 * 规范产品对象组成部分的创建。这个接口规定要实现复杂对象的哪些部分的创建。
 * Created by ${super} on ${2017/5/27}.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();

    Person buildPerson();
}
