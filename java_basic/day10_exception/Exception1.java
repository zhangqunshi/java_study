
public class Exception1 {

    public static String lowercase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        String w = null;
        String x = lowercase(w);
        System.out.println(x);
    }    
}