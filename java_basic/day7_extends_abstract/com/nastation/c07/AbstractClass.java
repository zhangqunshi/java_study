abstract class A {
    A() {
        System.out.println("A");
    }

    abstract void print();
}

class B extends A {
    B() {
        System.out.println("B");
    }

    void print() {
    }


    public static void main(String[] args) {
        new A();
        new B();
    }
}


