import java.util.Random;

/**
 * Array examples
 *
 * @author Kris
 * @version 0.1   2007.8.16
 */
public class ArrayNew {

    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        int[] a;
        char[] b;
        boolean[] c;
        double[] d;

        a = new int[pRand(5)];
        b = new char[pRand(5)];
        c = new boolean[pRand(5)];
        d = new double[pRand(5)];

        System.out.println("length of a = " + a.length);
        System.out.println("length of b = " + b.length);
        System.out.println("length of c = " + c.length);
        System.out.println("length of d = " + d.length);

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
        }

        int[] x = new int[2];
        x[0] = 10;
        x[1] = 20;

        int[] y = {1, 2};
        int[] z = new int[]{3, 4};

    }
}