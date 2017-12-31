package TemplateMethod;

public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public final void templeteMethod(){
        primitiveOperation1();
        System.out.println("模板方法执行了");
        primitiveOperation2();
    }
}
