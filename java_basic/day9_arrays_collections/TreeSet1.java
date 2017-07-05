
import java.util.Random;
import java.util.TreeSet;

public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Integer> c = new TreeSet<>();

        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            int x = rand.nextInt(100);
            System.out.print(x + ",");
            c.add(x);
        }
        System.out.println();

        for (Integer i : c) {
            System.out.print(i + ",");
        }
        System.out.println();
        
    }

}