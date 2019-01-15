package templateMethod;

public class ConcreteClass1 extends TemplateMethodClass {

    private boolean allowedFlag = true;
    
    @Override
    protected void doAnything() {
        System.out.println("Class1 does anything.");
    }

    @Override
    protected void doSomething() {
        System.out.println("Class1 does something.");
    }
    
    protected boolean isAllowed() {
        return this.allowedFlag;
    }
    
    public void setAllowedFlag(boolean flag) {
        this.allowedFlag = flag;
    }
}
