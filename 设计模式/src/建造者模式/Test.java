package 建造者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
public class Test {

    public static void main(String[] args){
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
    }
}
