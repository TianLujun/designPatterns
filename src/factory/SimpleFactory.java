package factory;

public class SimpleFactory {
    
    @SuppressWarnings("unchecked")
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch(Exception e) {
            // TODO:
        }
        return product == null ? null : (T)product;
    }
}
