
import java.util.*;
import java.util.HashSet;

public class HashSet1 {

    public static void main(String[] args) {
        HashSet<String> c = new HashSet<>();
        Collections.addAll(c, "A B C D E".split(" "));

        for (String i : c) {
            System.out.print(i + ",");
        }
        System.out.println();

        c.add("H");
        System.out.println("H: " + c.contains("H"));

        HashSet<String> set2 = new HashSet<>();
        Collections.addAll(set2, "A B C".split(" "));
        System.out.println("set2 is in c: " + c.containsAll(set2));

        c.removeAll(set2);
        for (String i : c) {
            System.out.print(i + ",");
        }
        System.out.println();

    }

}