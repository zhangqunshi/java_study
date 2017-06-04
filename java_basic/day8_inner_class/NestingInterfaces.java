/**
 * Ƕ�׽ӿ�
 *
 * @author kris
 */

class A2 {
    interface B {
        void f();
    }

    public class BImp implements B {
        public void f() {
            System.out.println("BImp");
        }
    }

    private class BImp2 implements B {
        public void f() {
            System.out.println("BImp2");
        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        public void f() {
            System.out.println("CImp");
        }
    }

    private class CImp2 implements C {
        public void f() {
            System.out.println("CImp2");
        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        public void f() {
            System.out.println("DImp");
        }
    }

    public class DImp2 implements D {
        public void f() {
            System.out.println("DImp2");
        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    // Redundant "public":
    public interface H {
        void f();
    }

    void g();
    // Cannot be private within an interface:
    // private interface I {}
}

public class NestingInterfaces {
    public class BImp implements A2.B {
        public void f() {
            System.out.println("BImp implements A2.B");
        }
    }

    class CImp implements A2.C {
        public void f() {
            System.out.println("BImp implements A2.C");
        }
    }

    // Cannot implement a private interface except
    // within that interface's defining class:
    // class DImp implements A2.D {
    // public void f() {
    // }
    // }

    class EImp implements E {
        public void g() {
            System.out.println("EImp");
        }
    }

    class EGImp implements E.G {
        public void f() {
            System.out.println("EGImp");
        }
    }

    class EImp2 implements E {
        public void g() {
            System.out.println("EImp2");
        }

        class EG implements E.G {
            public void f() {
                System.out.println("EG");
            }
        }
    }

    public static void main(String[] args) {
        A2 a = new A2();
        // Can't access A2.D:
        // ! A2.D ad = a.getD();
        // Doesn't return anything but A2.D:
        // ! A2.DImp2 di2 = a.getD();
        // Cannot access a member of the interface:
        // ! a.getD().f();
        // Only another A2 can do anything with getD():
        A2.DImp2 g = a.new DImp2();
        A2 a2 = new A2();
        a2.receiveD(a.getD());
    }
}