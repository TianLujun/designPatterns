package builder;

import java.util.ArrayList;

public class ConcreteProduct1 extends Builder {

    private Product product = new ProductModel1();
    
    @Override
    public void setPart(ArrayList<String> sequence) {
        this.product.setSequence(sequence);
    } 

    @Override
    public Product buildProduct() {
        return this.product;
    }

}
