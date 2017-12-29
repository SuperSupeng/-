package PrototypePattern;

public abstract class Prototype implements Cloneable{
    private String id;

    public Prototype(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public abstract Prototype myClone() throws CloneNotSupportedException;
}
