import java.util.*;

class Cat {}
class Dog {}

public class Map3 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("a", new Cat());
        map.put("b", new Dog());

        System.out.println("keys = " + map.keySet());
        System.out.println("values = " + map.values());

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String)it.next();
            System.out.println("key=" + key + ", value=" + map.get(key));
        }

        System.out.println("-----------");

        for (Object key : map.keySet()) {
            System.out.println("key=" + key + ", value=" + map.get(key));
        }

        System.out.println(map);

        Map<String, Map> map2 = new HashMap<>();
        map2.put("c", map);

        Map map3 = new HashMap();
        map3.put("d", map2);

        System.out.println(map3);
        
    }
}