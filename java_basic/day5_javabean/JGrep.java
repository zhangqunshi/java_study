import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A very simple version of the "grep" program
 */
public class JGrep {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        Pattern p = Pattern.compile(args[1]);

        int index = 0;
        Matcher m = p.matcher("");

        //for (String line : FileReader(args[0]))
        for (String line : "use IO to read a file in here, and file name is args[0]"
                .split(",")) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": "
                        + m.start());
            }
        }

    }

}
