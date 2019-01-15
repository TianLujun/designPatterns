package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {

    // Class cls = null;
    
    Object obj = null;
    
    public DynamicProxy(Object _obj) {
        this.obj = _obj;
    }
    
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if(method.getName().equalsIgnoreCase("request")) {
            System.out.println("The proxy runs.");
        }
        return result;
    }

}
