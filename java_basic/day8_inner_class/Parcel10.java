//: c08:Parcel10.java
// Static inner classes.

public class Parcel10 {

    static int a = 10;

    private static class PContents implements Contents {
        private int i = 11;

        public int value() {
            i = a;
            return i;
        }
    }

    protected static class PDestination implements Destination {
        private String label;

        PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        // Static inner classes can contain other static elements:
        public static void f() {
        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
                System.out.println("AnotherLevel");
            }

            static int x = 10;
        }
    }

    public static Destination dest(String s) {
        return new PDestination(s);
    }

    public static Contents cont() {
        return new PContents();
    }

    public static void main(String[] args) {
        Contents c = cont();
        Destination d = dest("Tanzania");
        System.out.println(c.value());
        System.out.println(d.readLabel());
        Parcel10.PDestination.AnotherLevel.f();

        PContents pc = new PContents();
    }
}