//: c04:InitialValues.java
// Shows default initial values.

class Measurement {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String g;
    int x = f(i);
    //int bbb;

    Measurement() {
        //t = true;
    }

    void print() {
        System.out.println("Data type Initial value\n" + "boolean " + t + "\n"
                + "char [" + c + "] " + (int) c + "\n" + "byte " + b + "\n"
                + "short " + s + "\n" + "int " + i + "\n" + "long " + l + "\n"
                + "float " + f + "\n" + "double " + d + "\nString " + g
                + "\nx " + x //+ "\nbbb " + bbb
        );
    }

    int f(int a) {
        return a;
        //System.out.println("f(int a)");
        //return bbb;
    }
}

public class InitialValues {
    public static void main(String[] args) {
        Measurement d = new Measurement();
        d.print();
        /*
		 * In this case you could also say: new Measurement().print();
		 */
    }
} // /:~
