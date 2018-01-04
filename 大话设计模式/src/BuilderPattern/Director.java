package BuilderPattern;

public class Director {
    public void construct(Builder builder){
        builder.builderPartA();
        builder.builderPartB();
    }
}
