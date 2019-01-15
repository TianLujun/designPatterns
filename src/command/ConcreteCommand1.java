package command;

public class ConcreteCommand1 extends Command {

    private Reciever reciever;
    
    public ConcreteCommand1(Reciever _reciever) {
        this.reciever = _reciever;
    }
    
    @Override
    public void execute() {
        this.reciever.doSomething();
    }

}
