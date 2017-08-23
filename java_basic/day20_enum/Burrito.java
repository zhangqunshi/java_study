package enumerated;

import static enumerated.Spiciness.*;

public class Burrito {
    Spiciness s;
    public Burrito(Spiciness x) {
        this.s = x;
    }

    public String toString() { return "Burrito is: " + s;}

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
}
