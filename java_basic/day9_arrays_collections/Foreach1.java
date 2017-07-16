import java.util.*;

public class Foreach1 {
    public static void main(String[] args) {
        Collection<String> cs = new LinkedList<>();
        Collections.addAll(cs, "Hello kris how are you".split(" "));

        for (String s : cs) {
            System.out.println(s);
        }
    }
}