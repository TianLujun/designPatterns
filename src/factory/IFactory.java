package factory;

public interface IFactory {    
    public <T extends Product> T createProduct(Class<T> c);
}
