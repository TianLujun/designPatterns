package singleton;

public class EagerSingleton {
    
    final static EagerSingleton singleton = new EagerSingleton();
    
    private EagerSingleton() {
        
    }
    
    public static EagerSingleton getSingleton() {
        return singleton;
    }
    
    public static void doSomething() {
        
    }
}
