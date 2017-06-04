//: c03:PassObject.java
// Passing objects to methods may not be what
// you're used to.
class Letter {
    char c;
    int i = 0;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    static void f2(int x) {
        x = 7;
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
        int b = 10;
        f2(b);
        System.out.println("3: b = " + b);
        f2(x.i);
        System.out.println("3: i = " + x.i);
    }
}