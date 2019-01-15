package builder;

import java.util.ArrayList;

public abstract class Builder {

    public abstract void setPart(ArrayList<String> sequence);
    
    public abstract Product buildProduct();
}
