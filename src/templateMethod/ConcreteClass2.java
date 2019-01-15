package templateMethod;

public class ConcreteClass2 extends TemplateMethodClass {

    @Override
    protected void doAnything() {
        System.out.println("Class2 does anything.");
    }

    @Override
    protected void doSomething() {
        System.out.println("Class2 does something.");
    }
    
    protected boolean isAllowed() {
        return false;
    }

}
