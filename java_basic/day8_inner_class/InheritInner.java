//: c08:InheritInner.java
// Inheriting an inner class.

/**
 * ���ڲ���̳�
 */
class WithInner {
    class Inner {
    }
}

public class InheritInner extends WithInner.Inner {
    //InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}