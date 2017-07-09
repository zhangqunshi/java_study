import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        // Random rand = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        Integer x = map.get(10);
        map.put(0, x == null ? 1 : x + 1);

        // for (int i = 0; i < 10; i++) {
        //     map.put(i, rand.nextInt(100));
        // }

        System.out.println(map);
        
    }
}