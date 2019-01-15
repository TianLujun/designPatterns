package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import decorator.ConcreteComponent;
import prototype.PrototypeClass;
import proxy.DynamicProxy;
import proxy.ForceRealSubject;
import proxy.IForceSubject;
import proxy.RealSubject;
import templateMethod.ConcreteClass1;

public class Main {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        PrintTitle.title("1.Singleton Pattern");
        singleton.EagerSingleton es = singleton.EagerSingleton.getSingleton();
        es.doSomething();
        singleton.LazySingleton ls = singleton.LazySingleton.getSingleton();
        ls.doSometing();
        
        
        PrintTitle.title("2.Factory Pattern");
        factory.IFactory concreteFactory = new factory.ConcreteFactroy();
        factory.Product cp1 = concreteFactory.createProduct(factory.ConcreteProduct1.class);
        cp1.method2();
        cp1.method1();
        factory.Product cp2 = concreteFactory.createProduct(factory.ConcreteProduct2.class);
        cp2.method2();
        cp2.method1();
        factory.Product cp3 = factory.SimpleFactory.createProduct(factory.ConcreteProduct1.class);
        cp3.method2();
        
        
        PrintTitle.title("3.Abstract Factory Pattern");
        abstractFactory.AbstractFactory abFactroy1 = new abstractFactory.Factory1();
        abstractFactory.AbstractFactory abFactroy2 = new abstractFactory.Factory2();
        abstractFactory.AbstractProductA a1 = abFactroy1.createProductA();
        abstractFactory.AbstractProductA a2 = abFactroy2.createProductA();
        abstractFactory.AbstractProductB b1 = abFactroy1.createProductB();
        abstractFactory.AbstractProductB b2 = abFactroy2.createProductB();
        a1.doSomething();
        a2.doSomething();
        b1.doSomething();
        b2.doSomething();
        
        
        PrintTitle.title("4.Template Method Pattern");
        templateMethod.TemplateMethodClass tmc1 = new templateMethod.ConcreteClass1();
        templateMethod.TemplateMethodClass tmc2 = new templateMethod.ConcreteClass2();
        ((ConcreteClass1) tmc1).setAllowedFlag(false);
        tmc1.templateMethod();
        ((ConcreteClass1) tmc1).setAllowedFlag(true);
        tmc1.templateMethod();
        tmc2.templateMethod();
        
        
        PrintTitle.title("5.Builder Pattern");
        builder.Director director = new builder.Director();
        director.getAProduct().run();
        director.getBProduct().run();
        
        
        PrintTitle.title("6.Proxy Pattern");
        proxy.ISubject realSubject = new RealSubject();
        proxy.ISubject subjectProxy1 = new proxy.Proxy(realSubject);
        subjectProxy1.request();
        
        proxy.ISubject subjectProxy2 = new proxy.NormalProxy();
        subjectProxy2.request();
        
        proxy.IForceSubject forceRealSubject = new ForceRealSubject();
        forceRealSubject.request();
        proxy.IForceSubject forceProxy1 = new proxy.ForceProxy(forceRealSubject);
        forceProxy1.request();
        proxy.IForceSubject forceProxy2 = forceRealSubject.getProxy();
        forceProxy2.request();
        
        InvocationHandler handler = new DynamicProxy(forceRealSubject);
        ClassLoader cl = forceRealSubject.getClass().getClassLoader();
        IForceSubject dproxy = (IForceSubject)Proxy.newProxyInstance(
                cl, new Class[]{IForceSubject.class}, handler);
        dproxy.request();
        
        
        PrintTitle.title("7.Prototype Pattern");
        prototype.PrototypeClass procls = new PrototypeClass();
        prototype.PrototypeClass cloneProcls = procls.clone();
        cloneProcls.setParam(1);
        System.out.println(cloneProcls.getParam());
        
        
        PrintTitle.title("8.Mediator Pattern");
        mediator.ConcreteMediator mediator1 = new mediator.ConcreteMediator();
        mediator.ConcreteColleague1 c1 = new mediator.ConcreteColleague1(mediator1);
        mediator.ConcreteColleague2 c2 = new mediator.ConcreteColleague2(mediator1);
        mediator1.setC1(c1);
        mediator1.doSomething1();
        mediator1.setC2(c2);
        mediator1.doSomething2();
        c1.dependentMethod();
        
        
        PrintTitle.title("9.Command Pattern");
        command.Invoker invoker1 = new command.Invoker();
        command.Reciever reciever1 = new command.ConcreteReciever1();
        command.Command command1 = new command.ConcreteCommand1(reciever1);
        invoker1.setCommand(command1);
        invoker1.action();
        command.PerfactInvoker invoker2 = new command.PerfactInvoker();
        command.PerfactCommand command2 = new command.ConcreteCommand2();
        invoker2.setCommand(command2);
        invoker2.action();
        
        
        PrintTitle.title("10.Responsibility Chain");
        responsibilityChain.Handler handler1 = new responsibilityChain.ConcreteHandler1();
        responsibilityChain.Handler handler2 = new responsibilityChain.ConcreteHandler2();
        responsibilityChain.Handler handler3 = new responsibilityChain.ConcreteHandler3();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(null);
        responsibilityChain.Request rc = new responsibilityChain.Request(2);
        responsibilityChain.Response response = handler1.handleMessage(rc);
        System.out.println(response.getCode());
        
        PrintTitle.title("11.Decorator Pattern");
        decorator.Component component = new ConcreteComponent();
        component = new decorator.ConcreteDecorator1(component);
        component = new decorator.ConcreteDecorator2(component);
        component.operate();
    }

}
