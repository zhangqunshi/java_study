import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;

public class LinkedList1 {

    public static void main(String[] args) {
        Collection<Integer> c = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        for (Integer x : c) {
            System.out.println(x);
        }
        
    }

}