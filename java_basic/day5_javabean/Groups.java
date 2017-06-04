import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {

    static public final String POEM = "This chapter will explain\n"
            + "how to use the CVS team\n"
            + "capabilities built into the Workbench.\n"
            + "The steps in this chapter are team oriented;\n"
            + "it will be difficult to complete these tutorials\n"
            + "if others are not simultaneously\n"
            + "working through this chapter.";

    public static void main(String[] args) {

        // 捕获每行的最后3个词
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$")
                .matcher(POEM);
        while (m.find()) {
            for (int i = 0; i < m.groupCount(); i++) {
                Finding.print("[" + m.group(i) + "]");
            }
            Finding.print();
        }
    }

}
