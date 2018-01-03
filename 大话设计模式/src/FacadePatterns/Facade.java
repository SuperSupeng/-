package FacadePatterns;

public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void MethodA(){
        System.out.println("方法A");
        one.MethodOne();
        two.MethodTwo();
        four.MethodFour();
    }

    public void methodB(){
        System.out.println("方法B");
        two.MethodTwo();
        three.MethodThree();
    }
}
