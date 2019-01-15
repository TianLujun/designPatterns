package mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    
    public void method1() {
        System.out.println("Concrete colleague 2 runs.");
    }
}
