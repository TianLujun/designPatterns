package responsibilityChain;

public class ConcreteHandler2 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return new Level(2);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("Handler2 responses.");
    }

}
