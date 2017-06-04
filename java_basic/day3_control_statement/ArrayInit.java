public class ArrayInit {

    public static void main(String[] args) {
        Integer[] a = {
                new Integer(1),
                new Integer(2),
                new Integer(3)
        };
        Integer[] b = new Integer[]{
                new Integer(1),
                new Integer(2),
                new Integer(3),
        };
        System.out.println("len of a =" + a.length);
        System.out.println("len of b =" + b.length);
    }
}