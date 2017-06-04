//: c08:MultiInterfaces.java
// Two ways that a class can
// implement multiple interfaces.

interface A3 {
}

interface B {
}

class X implements A3, B {
}

class Y implements A3 {
    B makeB() {
        // Anonymous inner class:
        return new B() {
        };
    }
}

public class MultiInterfaces {

    static void takesA(A3 a) {
    }

    static void takesB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}