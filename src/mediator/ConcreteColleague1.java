package mediator;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }
    
    public void method1() {
        System.out.println("Concrete colleague 1 runs.");
    }
    
    public void dependentMethod() {
        System.out.print("Concrete colleague1 need to use mediator. ");
        super.mediator.doSomething2();
    }
}
