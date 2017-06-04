//: c08:Callbacks.java
// Using inner classes for callbacks
interface Incrementable {
    void increment();
}

// Very simple to just implement the interface:
class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

// If your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {
    private int i = 0;

    private void incr() {
        i++;
        System.out.println(i);
    }

    /**
     * Closure ����ڲ���ֻ��ʵ����Incrementable �Ա��ṩ����Callee2 ��һ���ҹ���
     * ����һ�����յĹҹ�,�õ���Incrementable ���õ��κ��˶�ֻ�ܵ���increment() ������
     * �����������������ָ�벻ͬ������ָ�벻�߱������ı��մ�ʩ�����Բ���ʧ�ص�Σ��
     *
     * @author kris
     */
    private class Closure implements Incrementable {
        public void increment() {
            incr();
        }
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Caller caller1 = new Caller(c1);
        caller1.go();
        caller1.go();


        Callee2 c2 = new Callee2();
        // MyIncrement.f(c2);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller2.go();
        caller2.go();
        caller2.go();
    }
}