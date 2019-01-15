package proxy;

public class NormalSubject implements ISubject {

    public NormalSubject(ISubject _subject) throws Exception {
        if(!(_subject instanceof NormalProxy)) {
            throw new Exception("Only NormalProxy can agent NormalSubject.");
        }
    }
    
    public void request() {
        System.out.println("NormalSubject is doing something.");
    }
}
