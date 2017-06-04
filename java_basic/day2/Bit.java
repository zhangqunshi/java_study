/**
 * 按位运算符的演示
 *
 * @author Kris
 * @version 1.0  2008.1.8  16:39
 */
public class Bit {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = a ^ b;
        int d = a & b;
        int e = a | b;
        int f = ~a;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}