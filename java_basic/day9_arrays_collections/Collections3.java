
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Collections3 extends AbstractCollection<String> {

    private String[] arr = new String[8];
    private int arrIdx = 0;

    public int size() {
        return arr.length;
    }

    public boolean add(String s) {
        arr[arrIdx++] = s;
        return true;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int idx = 0;
            public boolean hasNext() {
                // return idx < arr.length;
                return idx < arrIdx;
            }

            public String next() {
                return arr[idx++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

    public static void display(Iterator<String> it) {
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Collections3 c = new Collections3();
        c.add("hello");
        c.add("kris");

        display(c.iterator());
        
    }

}