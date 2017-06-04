//: c08:Parcel3.java
// Returning a reference to an inner class.

public class Parcel3 {

    //继承外部类后，则这个内部类也不可见
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //继承外部类后，则这个内部类可见
    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination dest(String s) {
        //可以访问内部类中私有的东西
        return new PDestination(s);
    }

    public Contents cont() {
        return new PContents();
    }
}

class Test {
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.cont();
        Destination d = p.dest("Tanzania");
        // Illegal -- can't access private class:
        //Parcel3.PContents pc = p.new PContents();
    }
}