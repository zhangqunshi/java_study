
public class ClassCasts {
    public static void main(String[] args) {
        List x = new ArrayList();
        Class<ArrayList> cls = x.class;
        ArrayList y = cls.cast(x);

        y = (ArrayList)x;
    }
}