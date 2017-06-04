//: c08:Parcel10.java
// Static inner classes.

public class Parcel10Test {//extends Parcel10{

    public static void main(String[] args) {
        Contents c = Parcel10.cont();
        Destination d = Parcel10.dest("Tanzania");
        System.out.println(c.value());
        System.out.println(d.readLabel());
        Parcel10.PDestination.AnotherLevel.f();

        Parcel10.PDestination pd = new Parcel10.PDestination("f");
    }
}