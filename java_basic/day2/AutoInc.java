//: c03:AutoInc.java
// Demonstrates the ++ and -- operators.

/**
 * 自动递增和递减
 *
 * @author Kris
 * @version 1.0    2007.8.14 15:08
 */
public class AutoInc {

    public static void main(String[] args) {
        int i = 1;
        double a = 1.1;
        char b = 'a';
        boolean c = false;

        prt("a: " + (++a));
        prt("b: " + (++b));
        //prt("c: " + (++c));
        prt("i : " + i);
        prt("++i : " + ++i); // Pre-increment
        prt("i++ : " + i++); // Post-increment
        prt("i : " + i);
        prt("--i : " + --i); // Pre-decrement
        prt("i-- : " + i--); // Post-decrement
        prt("i : " + i);
    }

    static void prt(String s) {
        System.out.println(s);
    }
}