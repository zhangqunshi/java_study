/**
 * 算术运算符的演示
 *
 * @author Kris
 * @version 1.0  2008.1.8  14:44
 */
public class MathOps2 {

    public static void main(String[] args) {

        // demo for "+"
        float f1 = 0.1f;
        float f2 = 0.2f;
        float f3 = f1 + f2;
        System.out.println("f3=" + f3);

        // demo for "-"
        short a = 2;
        short b = 9;
        int c = a - b;
        System.out.println("c=" + c);

        // demo for "*"
        double x = 1.5;
        double y = 2;
        double z = x * y;
        System.out.println("z=" + z);

        // demo for "/"
        int i = 9;
        int j = 2;
        int k = i / j;
        System.out.println("k=" + k);

        // demo for "%"
        int d1 = 9;
        int d2 = 2;
        int d3 = d1 % d2;
        System.out.println("d3=" + d3);

        int i1 = 8;
        int i2 = 9;
        i1 += i2;
        System.out.println("i1=" + i1);

        int s1 = 9;
        s1 %= 7;
        System.out.println("s1=" + s1);

        int a2 = 8;
        a2++;
        ++a2;
        int b2 = ++a2;
        int b3 = a2++;
        System.out.println("a2=" + a2);
        System.out.println("b2=" + b2);
        System.out.println("b3=" + b3);
    }
}