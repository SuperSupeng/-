package 原型模式;

/**
 * Created by ${super} on ${2017/5/27}.
 */
    public class Test {
    public static void main(String[] args){

        Prototype prototype = new Prototype();
        Prototype prototype1 = prototype.clone();

        System.out.println(prototype.getS() == prototype1.getS());
        System.out.println(prototype.getS());
        System.out.println(prototype1.getS());

    }
}
