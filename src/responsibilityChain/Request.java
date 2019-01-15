package responsibilityChain;

public class Request {

    private int level = 0;
    
    public Request(int level) {
        this.level = level;
    }
    
    public Level getRequestLevel() {
        return new Level(this.level);
    }
}
