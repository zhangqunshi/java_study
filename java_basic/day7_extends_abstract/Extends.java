class A extends Object {
    private int a = 8;

    void print() {
        System.out.println("hello A");
    }

    public String toString() {
        return "" + a;
    }
}

class B extends A {
    public void print() {
        super.print();
    }
}


class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b);
        b.print();
    }
}