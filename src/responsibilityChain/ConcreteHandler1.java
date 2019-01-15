package responsibilityChain;

public class ConcreteHandler1 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return new Level(1);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("Handler1 responses.");
    }

}
