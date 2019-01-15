package prototype;

public class PrototypeClass implements Cloneable {
    
    int param = 0;
    String str = "Prototype";
    
    public PrototypeClass() {
        System.out.println("Constructor runs.");
    }
    
    public void setParam(int param) {
        this.param = param;
    }
    
    public int getParam() {
        return this.param;
    }
    
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass)super.clone();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
