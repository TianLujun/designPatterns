package templateMethod;

public abstract class TemplateMethodClass {

    protected abstract void doAnything();
    protected abstract void doSomething();
    
    final public void templateMethod() {
        this.doAnything();
        if(this.isAllowed()) {
            this.doSomething();    
        }
    }
    
    protected boolean isAllowed() {
        return true;
    }
}
