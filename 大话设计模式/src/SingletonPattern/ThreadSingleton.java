package SingletonPattern;

//多线程单例模式要加锁
public class ThreadSingleton {
    private static ThreadSingleton instance;
    private static final Object syncRoot = new Object();

    private ThreadSingleton(){}

    public static ThreadSingleton getInstance(){
        //每次都会加锁，会影响性能
        synchronized (syncRoot){
            if(instance == null){
                instance = new ThreadSingleton();
            }
        }
        return instance;
    }
}
