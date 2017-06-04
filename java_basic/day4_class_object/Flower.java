//: c04:Flower.java
// Calling constructors with "this."

public class Flower {

    int petalCount = 0;

    String s = new String("null");

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= "
                + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ String arg only, s=" + ss);
        s = ss;
    }

    Flower(String s, int p) {
        this(p);
        // ! this(s); // Can't call two!
        this.s = s; // Another use of "this"(注意这里的this.s 是类里面的s 而等号后面的s 是参数s
        // 二者是不同的可以用语句System.out.println(this.s)和System.out.printlln(s)来确认一个打印null
        // 一个打印hi)
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void print() {
        // ! this(11); // Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.print();
    }
} // /:~(
