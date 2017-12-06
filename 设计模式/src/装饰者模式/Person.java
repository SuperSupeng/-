package 装饰者模式;

/**
 * Created by ${super} on ${2017/5/27}.
 * 作为基类，所有装扮都直接或者间接继承该类
 */
public class Person {
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.printf("装扮的%s\n", name);
    }
}
