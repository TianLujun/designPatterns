package builder;

import java.util.ArrayList;

public abstract class Product {
    
    private ArrayList<String> sequence = new ArrayList<String>();
    
    public abstract void step1();
    public abstract void step2();
    public abstract void step3();
    
    final public void run() {
        for(String i : sequence) {
            String stepName = i;
            if(stepName.equalsIgnoreCase("step1")) {
                this.step1();
            } else if(stepName.equalsIgnoreCase("step2")) {
                this.step2();
            } else if(stepName.equalsIgnoreCase("step3")) {
                this.step3();
            }
            
        }
    }
    
    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
