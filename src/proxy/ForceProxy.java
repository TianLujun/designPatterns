package proxy;

public class ForceProxy implements IForceSubject {

    private IForceSubject forceRealSubject = null;
    
    public ForceProxy(IForceSubject _forceRealSubject) {
        this.forceRealSubject = _forceRealSubject;
    }
    
    public void request() {
        this.forceRealSubject.request();
    }
    
    public IForceSubject getProxy() {
        return this;
    }

}
