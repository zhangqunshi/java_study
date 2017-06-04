//: c08:Parcel6.java
// A method that returns an anonymous inner class.

public class Parcel6 {

    private int a = 10;

    public Contents cont() {
        return new Contents() {
            private int i = 11;

            public int value() {
                a = 9;
                print();
                return i;
            }
        }; // Semicolon required in this case
    }

    void print() {
        System.out.println("hi, a=" + a);
    }

    public static void main(String[] args) {
        Parcel6 p = new Parcel6();
        Contents c = p.cont();
        c.value();
    }
}