package proxy;

public class Proxy implements ISubject {

    private ISubject subject = null;
    
    public Proxy() {
        this.subject = new Proxy();
    }
    
    public Proxy(Object...Objects) {
    }
    
    public Proxy(ISubject _subject) {
        this.subject = _subject;
    }
    
    public void request() {
        before();
        this.subject.request();
        after();
    }
    
    private void before() {
        System.out.println("Before.");
    }
    
    private void after() {
        System.out.println("After.");
    }

}
