
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.*;

public class Collections1 {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        Integer[] moreInts = {6, 7, 8};
        c.addAll(Arrays.asList(moreInts));

        Collections.addAll(c, 11, 12);
        Collections.addAll(c, moreInts);

        List<Integer> list = Arrays.asList(16, 17);
        list.set(1, 99);
        // list.add(18);  // cannot resize

        for (Integer i : c) {
            System.out.println(i);
        }

        System.out.println("------");

        for (Integer k : list) {
            System.out.println(k);
        }
        
    }

}