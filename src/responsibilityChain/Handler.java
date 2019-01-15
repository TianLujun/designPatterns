package responsibilityChain;

public abstract class Handler {

    private Handler nextHandler;
    
    public final Response handleMessage(Request request) {
        Response response = null;
        if(this.getHandlerLevel().getLevel() == request.getRequestLevel().getLevel()) {
            response = this.echo(request);
        } else {
            if(this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                System.out.println("There is no handler.");
            }
        }
        return response;
        
        
    }
    
    public void setNext(Handler _nextHandler) {
        this.nextHandler = _nextHandler;
    }
    
    protected abstract Level getHandlerLevel();
    
    protected abstract Response echo(Request request);
}
