package proxy;

public class NormalProxy implements ISubject {

private ISubject subject = null;
    
    public NormalProxy() {
        try {
            this.subject = new NormalSubject(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
