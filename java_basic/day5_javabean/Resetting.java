import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {

    public static void main(String[] args) {
        Matcher m = Pattern.compile("[frb][aiu][gx]").matcher(
                "fix the rug with bags");

        while (m.find()) {
            System.out.println(m.group() + " ");
        }
        System.out.println();
        m.reset("fix the rig with rags");

        while (m.find()) {
            System.out.println(m.group() + " ");
        }
    }

}
