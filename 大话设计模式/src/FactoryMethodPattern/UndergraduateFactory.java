package FactoryMethodPattern;

public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
