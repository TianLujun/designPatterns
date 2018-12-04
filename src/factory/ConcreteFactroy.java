package factory;

public class ConcreteFactroy implements IFactory {

    @SuppressWarnings("unchecked")
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch(Exception e) {
            
        }
        return product == null ? null : (T)product;
    }
}
