
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Collections2 {

    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<>();
        c.add("hello");
        c.add("kris");

        display(c.iterator());

        Set<String> s = new HashSet<>();
        s.add("123");
        s.add("abc");

        display(s.iterator());
        
    }

}