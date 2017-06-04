//: c08:MultiNestingAccess.java
// Nested classes can access all members of all
// levels of the classes they are nested within.
class MNA {
    private void f() {
        System.out.println("f()");
    }

    class A {
        private void g() {
            System.out.println("g()");
        }

        public class B {
            void h() {
                //����ⲿ���ж��g()��������ʹ���������ڲ����g()������
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();

    }
}