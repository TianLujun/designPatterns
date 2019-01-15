package proxy;

public class RealSubject implements ISubject {

    public void request() {
        System.out.println("RealSubject is doing something.");
    }

}
