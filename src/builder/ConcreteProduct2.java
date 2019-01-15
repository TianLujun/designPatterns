package builder;

import java.util.ArrayList;

public class ConcreteProduct2 extends Builder {

    private Product product = new ProductModel2();
    
    @Override
    public void setPart(ArrayList<String> sequence) {
        this.product.setSequence(sequence);
    } 

    @Override
    public Product buildProduct() {
        return this.product;
    }
}
