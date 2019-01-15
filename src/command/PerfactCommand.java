package command;

public abstract class PerfactCommand {

    protected final Reciever reciever;
    
    public PerfactCommand(Reciever _reciever) {
        this.reciever = _reciever;
    }
    
    public abstract void execute();
}
