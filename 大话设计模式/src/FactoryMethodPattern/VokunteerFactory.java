package FactoryMethodPattern;

public class VokunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeifeng() {
        return new Volunter();
    }
}
