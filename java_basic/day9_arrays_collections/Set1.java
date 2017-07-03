
import java.util.HashSet;
import java.util.Collection;

public class Set1 {

    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        c.add(1);
        c.add(1);

        for (Integer i : c) {
            System.out.println(i);
        }
        
    }

}