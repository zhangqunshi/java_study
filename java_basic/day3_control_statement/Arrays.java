/**
 * 数组例子
 *
 * @author Kris
 * @version 0.1    2007.8.16
 */
public class Arrays {

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;

        int[] a3 = new int[5];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = i;
        }
        System.out.println("-----------a3---------");
        print(a3);

        int[] a4 = new int[]{1, 2, 3};

        for (int i = 0; i < a2.length; i++) {
            a2[i]++;
        }
        System.out.println("-----------a2---------");
        print(a2);

    }
}