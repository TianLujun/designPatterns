package builder;

import java.util.ArrayList;

public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();
    private Builder builderA = new ConcreteProduct1();
    private Builder builderB = new ConcreteProduct2();
    
    public Product getAProduct() {
        this.sequence.clear();
        this.sequence.add("step2");
        this.sequence.add("step1");
        this.sequence.add("step3");
        builderA.setPart(sequence);
        return builderA.buildProduct();
    }
    
    public Product getBProduct() {
        this.sequence.clear();
        this.sequence.add("step3");
        this.sequence.add("step2");
        this.sequence.add("step1");
        builderB.setPart(sequence);
        return builderB.buildProduct();
    }
}
