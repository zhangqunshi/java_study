import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {

    public static void main(String[] args) {
        String input = "This!! unusual use!! of exclamation!!points";

        print(Arrays.toString(Pattern.compile("!!").split(input)));

        // only do the first three
        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }

    private static void print(String string) {
        System.out.println(string);
    }

}
