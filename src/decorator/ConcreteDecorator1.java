package decorator;

public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component _component) {
        super(_component);
    }
    
    private void extendMethod() {
        System.out.println("Concrete decorator 1 runs.");
    }
    
    @Override
    public void operate() {
        extendMethod();
        super.operate();
    }

}
