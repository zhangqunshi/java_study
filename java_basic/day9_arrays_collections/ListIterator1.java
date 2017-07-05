import java.util.Iterator;
import java.util.*;

public class ListIterator1 {

    public static void main(String[] args) {
        List<String> x = new ArrayList<>();
        x.add("hello");
        x.add("kris");

        ListIterator li = x.listIterator(x.size());
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        li = x.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }


    }
}