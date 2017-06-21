package 建造者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pd){
        pd.buildHead();
        pd.buildBody();
        pd.buildFoot();
        return pd.buildPerson();
    }
}
