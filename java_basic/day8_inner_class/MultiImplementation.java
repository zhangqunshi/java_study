//: c08:MultiImplementation.java
// With concrete or abstract classes, inner
// classes are the only way to produce the effect
// of "multiple implementation inheritance."

class C5 {
}

abstract class D {
}

class Z extends C5 {
    D makeD() {
        return new D() {
        };
    }
}

public class MultiImplementation {
    static void takesC(C5 c) {
    }

    static void takesD(D d) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takesC(z);
        takesD(z.makeD());
    }
}