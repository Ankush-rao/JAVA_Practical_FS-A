package Practical_6;

interface IA {
    void aMethod();
}

interface IB {
    void bMethod();
}

interface IC extends IA, IB {
    void cMethod();
}

class BaseClass {
    void baseMethod() {
        System.out.println("Base class method");
    }
}

class DerivedClass extends BaseClass implements IA, IB {
    public void aMethod() {
        System.out.println("aMethod() from IA");
    }
    public void bMethod() {
        System.out.println("bMethod() from IB");
    }
}

public class InterfaceExtendAndImplementDemo {
    public static void main(String[] args) {
        
        DerivedClass d = new DerivedClass();
        d.baseMethod();
        d.aMethod();
        d.bMethod();

        
        IC obj = new IC() {
            public void aMethod() { System.out.println("IC -> aMethod"); }
            public void bMethod() { System.out.println("IC -> bMethod"); }
            public void cMethod() { System.out.println("IC -> cMethod"); }
        };

        obj.aMethod();
        obj.bMethod();
        obj.cMethod();
    }
}
