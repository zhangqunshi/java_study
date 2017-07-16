import java.util.*;

// class Map {

//     private int currIdx = 0;
//     private String[] keys;
//     private String[] values;

//     public void put(String key, String value) {
//         keys[currIdx++] = key;
//         values[currIdx++] = value;
//     }

//     public Set<Entry> entrySet() {
//         Set<Entry> s = new HashSet<>();
//         for (int i = 0; i < keys.length; i++) {
//             s.add(new Entry(keys[i], values[i]));
//         }
//         return s;
//     }
// }

// class Entry {
//     String key;
//     String value;

//     public Entry(String key, String value) {
//         this.key = key;
//         this.value = value;
//     }

//     public String getKey() {
//         return this.key;
//     }

//     public String getValue() {
//         return this.value;
//     }
// }

public class Foreach3 {
    public static void main(String[] args) {
        
        // { "a": "1",  "b": "2" }
        // entry is object of Entry class, so one entry("a", "1")
        // entrySet --> [ entry("a", "1"), entry("b", "2") ]
        Map<String, String> x = System.getenv();
        Set<Map.Entry<String, String>> y = x.entrySet();
       
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
