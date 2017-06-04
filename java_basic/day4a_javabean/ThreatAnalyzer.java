import java.util.Scanner;
import java.util.regex.MatchResult;

public class ThreatAnalyzer {

    static String threatData = "58.27.82.161@02/10/2005\n"
            + "58.27.82.162@02/12/2005\n" + "58.27.82.163@02/11/2005\n"
            + "58.27.82.164@02/10/2005\n" + "58.27.82.165@22/10/2005\n"
            + "[Next log section with different data form]";

    public static void main(String[] args) {
        Scanner in = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@"
                + "(\\d{2}/\\d{2}/\\d{4})";

        while (in.hasNext(pattern)) {
            in.next(pattern);
            MatchResult match = in.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.printf("Thread on %s from %s\n", date, ip);
        }
    }

}
