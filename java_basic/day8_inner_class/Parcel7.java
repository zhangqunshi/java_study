//: c08:Parcel7.java
// An anonymous inner class that calls
// the base-class constructor.

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }

    @Override
    public String toString() {
        return "i=" + i;
    }


}

public class Parcel7 {
    public Wrapping wrap(int x) {
        // Base constructor call:
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Wrapping w = p.wrap(10);
        System.out.print(w.value());
    }
}