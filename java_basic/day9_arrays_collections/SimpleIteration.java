import java.util.Iterator;
import java.util.*;

public class SimpleIteration {

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("kris");

        Iterator<String> it = x.iterator();
        while(it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            it.remove();
        }

        System.out.println("---");

        for (String i : x) {
            System.out.println(i);
        }

    }
}