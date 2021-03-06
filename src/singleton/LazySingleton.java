package singleton;

public class LazySingleton {
    
    private static LazySingleton singleton = null;
    
    private LazySingleton() {
        
    }
    
    public static synchronized LazySingleton getSingleton() {
        if(singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
    
    public static void doSometing() {
        
    }
}
