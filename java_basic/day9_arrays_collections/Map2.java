import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 50);

        System.out.println(map.containsKey(0));
        System.out.println(map.containsValue(100));
        
    }
}