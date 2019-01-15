package command;

public class ConcreteCommand2 extends PerfactCommand {

    public ConcreteCommand2() {
        super(new ConcreteReciever2());
    }

    public ConcreteCommand2(Reciever _reciever) {
        super(_reciever);
    }
    
    @Override
    public void execute() {
        super.reciever.doSomething();
    }

}
