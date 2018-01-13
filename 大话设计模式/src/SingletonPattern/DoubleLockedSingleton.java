package SingletonPattern;

//多线程单例模式要加锁
public class DoubleLockedSingleton {
    private static DoubleLockedSingleton instance;
    private static final Object syncRoot = new Object();

    private DoubleLockedSingleton(){}

    public static DoubleLockedSingleton getInstance(){
        //双重锁定
        if(instance == null){
            synchronized (syncRoot){
                if(instance == null){
                    instance = new DoubleLockedSingleton();
                }
            }
        }
        return instance;
    }
}
