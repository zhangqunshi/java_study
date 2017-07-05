import java.util.Iterator;
import java.util.*;

public class SimpleIteration2 {

    static void display(Collection col) {
        Iterator it = col.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("kris");

        display(x);

        HashSet<String> set = new HashSet();
        set.add("hello");
        display(set);

    }
}