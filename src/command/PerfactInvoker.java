package command;

public class PerfactInvoker {

    private PerfactCommand command;
    
    public void setCommand(PerfactCommand _command) {
        this.command = _command;
    }
    
    public void action() {
        this.command.execute();
    }
}
