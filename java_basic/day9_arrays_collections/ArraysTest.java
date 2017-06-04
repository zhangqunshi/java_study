import java.util.Arrays;

public class ArraysTest {

    //	public static String[] change(String[] a) {
    public static void change(String[] a) {
        String[] b = a;
        b[0] = "aaa";
//		return b;
    }

    public static void main(String[] args) {
        String[] a = {"1", "2", "3"};
//		String[] x = change(a);
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//		}

        change(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        String[] b = {"1", "2", "3"};
        String[] c = {"1", "2", "3"};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(b, c));

    }
}
