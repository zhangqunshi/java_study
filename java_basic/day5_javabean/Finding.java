import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Finding {

    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher(
                "Evening is full of the linnet's wings");

        while (m.find()) {
            print(m.group() + " ");
        }

        print();
        int i = 0;
        while (m.find(i)) {
            print(m.group() + " ");
            i++;
        }
    }

    static void print() {
        System.out.println();

    }

    static void print(String s) {
        System.out.print(s);
    }

}
