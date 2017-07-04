import java.util.*;




class Pet1 {

    public int i = 0;
    public Pet1(int a) {
        i = a;
    }

    @Override
    public boolean equals(Object o) {
        Pet1 other = (Pet1)o;
        if (this.i == other.i) {
            return true;
        }
        return false;
    }

}

public class List1 {
    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("kris");
        x.set(1, "world");
        System.out.println(x);
        System.out.println("---------");

        ArrayList<Pet1> y = new ArrayList<>();
        y.add(new Pet1(2));
        y.remove(new Pet1(3));
        System.out.println(y);

        System.out.println("index = " + y.indexOf(new Pet1(2)));

    }
}