//: c12:ShowMethods.java
// Using reflection to show all the methods of
// a class, even if the methods are defined in
// the base class.
import java.util.regex.*;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;

public class ShowMethods2 {
    static final String usage = "usage: \n"
            + "ShowMethods2 qualified.class.name\n"
            + "To show all methods in class or: \n"
            + "ShowMethods2 qualified.class.name word\n"
            + "To search for methods involving 'word'";

    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        try {
            Class c = Class.forName(args[0]);
            Method[] m = c.getMethods();
            Constructor[] ctor = c.getConstructors();
            if (args.length == 1) {
                for (int i = 0; i < m.length; i++) {
                    Matcher x = p.matcher(m[i].toString());
                    System.out.println(x.replaceAll(""));
                    // System.out.println(m[i]);
                }
                for (int i = 0; i < ctor.length; i++)
                    System.out.println(ctor[i]);
            } else {
                //判断特定的签名是否与我们的目标字串相符
                for (int i = 0; i < m.length; i++)
                    if (m[i].toString().indexOf(args[1]) != -1)
                        System.out.println(m[i]);
                for (int i = 0; i < ctor.length; i++)
                    if (ctor[i].toString().indexOf(args[1]) != -1)
                        System.out.println(ctor[i]);
            }
        } catch (ClassNotFoundException e) {
            System.err.println("No such class: " + e);
        }
    }
}
