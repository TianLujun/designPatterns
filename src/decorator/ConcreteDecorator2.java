package decorator;

public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component _component) {
        super(_component);
    }
    
    private void extendMethod() {
        System.out.println("Concrete Decorator 2 runs.");
    }
    
    public void operate() {
        super.operate();
        extendMethod();
    }

}
