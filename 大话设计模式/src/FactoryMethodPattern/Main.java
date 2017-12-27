package FactoryMethodPattern;

public class Main {
    public static void main(String[] args){
        IFactory factory = new UndergraduateFactory();
        LeiFeng studuent = factory.createLeifeng();

        studuent.buyRice();
        studuent.sweep();
        studuent.wash();
    }
}
