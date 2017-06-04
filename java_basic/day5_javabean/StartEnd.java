import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {

    static String input = "This chapter will explain\n"
            + "how to use the CVS team\n"
            + "capabilities built into the Workbench.\n"
            + "The steps in this chapter are team oriented;\n"
            + "it will be difficult to complete these tutorials\n"
            + "if others are not simultaneously\n"
            + "working through this chapter.";

    static class Display {
        private boolean regexPrinted = false;
        private String regex;

        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                print(regex);
                regexPrinted = false;
            }
            print(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            d.display("find() '" + m.group() + "' start= " + m.start()
                    + " end= " + m.end());
        }
        if (m.lookingAt()) //No reset() necessary
            d.display("lookingAt() start=" + m.start() + " end=" + m.end());

        if (m.matches()) //No reset() necessary
            d.display("matches() start=" + m.start() + " end=" + m.end());
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            print("input : " + in);
            for (String regex : new String[]{"\\w*ere\\w*", "\\w*ever", "T\\w+", "Never.*?!"}) {
                examine(in, regex);
            }
        }

    }

    static void print(String s) {
        System.out.println(s);
    }

}
