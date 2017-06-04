import java.util.Random;

public class ArrayClassObj {

    static Random rand = new Random();

    static int pRand(int mod) {
        return Math.abs(rand.nextInt()) % mod + 1;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[pRand(20)];
        Integer[] b = new Integer[]{new Integer(1), new Integer(2)};

        System.out.println("length of a = " + a.length);
        System.out.println("length of b = " + b.length);

        for (int i = 0; i < a.length; i++) {
            //a[i].compareTo(new Integer(20));
            a[i] = new Integer(pRand(500));
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}