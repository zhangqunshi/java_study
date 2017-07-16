import java.util.*;

public class Foreach4 {
    public static void test(Iterable<String> it) {
        for (String s : it) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList("1", "2"));
        String[] x = new String[] { "a", "b" };
        // test(x);
        test(Arrays.asList(x));
    }
}
