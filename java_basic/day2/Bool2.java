/**
 * 算术运算符的演示
 *
 * @author Kris
 * @version 1.0  2008.1.8  16:08
 */
public class Bool2 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        boolean d = false;

        if ((a < b) && (b < c)) {
            System.out.println("a is biggest!");
        } else {
            System.out.println("a is not biggest!");
        }

    }
}