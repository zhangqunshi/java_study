import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}"
public class TestRegularExpression {

    public static void main(String[] args) {
        if (args.length < 2) {
            print("Usage: \n java TestRegularExpression "
                    + "characterSequence regularExpression+");
            System.exit(0);
        }

        print("Input: \"" + args[0] + "\"");

        for (String arg : args) {
            print("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " + m.start()
                        + "-" + (m.end() - 1));
            }
        }
    }

    static void print(String s) {
        System.out.println(s);
    }

}
