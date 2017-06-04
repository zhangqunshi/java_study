import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheReplacements {

    public static void main(String[] args) {
        String s = "/*create a file, and use io to read that file*/";

        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL)
                .matcher(s);

        if (mInput.find()) {
            s = mInput.group(1); // Captured by parentheses
        }

        // replace two or more spaces with a single space
        s = s.replaceAll(" {2,}", " ");

        // replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode
        s = s.replaceAll("(?m)^ +", "");
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWELl)");

        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);

        // Process the find information as you
        // perform the replacements
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());

            // put in the remainder of the text
            m.appendTail(sbuf);
            print(sbuf.toString());
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }

}
