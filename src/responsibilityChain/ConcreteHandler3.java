package responsibilityChain;

public class ConcreteHandler3 extends Handler {

    @Override
    protected Level getHandlerLevel() {
        return new Level(3);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("Handler3 responses.");
    }

}
