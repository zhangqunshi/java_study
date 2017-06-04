//: c08:Parcel2.java
// Returning a reference to an inner class.

public class Parcel2 {

    public Parcel2() {
        System.out.println("Parcel2");
    }

    class Contents {
        private int i = 11;

        public Contents() {
            System.out.println("Contents");
        }

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        public Destination() {
            System.out.println("Destination");
        }

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents cont() {
        return new Contents();
    }

    public void ship(String dest) {
        System.out.println("ship");
        Contents c = cont();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tanzania");
        Parcel2 q = new Parcel2();
        // Defining references to inner classes:
        Parcel2.Contents c = q.cont();
        Parcel2.Destination d = q.to("Borneo");

        Parcel2.Destination d2 = q.new Destination();

        //new Destination();
    }
}