package proxy;

public class ForceRealSubject implements IForceSubject {

    private ForceProxy proxy = null;
    
    public void request() {
        if(this.isProxy()) {
            System.out.println("ForceRealSubject is doing something.");
        } else {
            System.out.println("Please use the proxy.");
        }        
    }

    public IForceSubject getProxy() {
        this.proxy = new ForceProxy(this);
        return this.proxy;
    }
    
    private boolean isProxy() {
        if(this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }

}
