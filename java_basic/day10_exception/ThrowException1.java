
public class ThrowException1 {

    public static String lowercase(String s) {
        if (s == null) {
            // do something here
            System.out.println("Wrong s");
            throw new NullPointerException("This is null point exception :-----) ");
            // return "";
        }
        return s.toLowerCase();        
    }

    public static void main(String[] args) {
        System.out.println(lowercase("HELLO"));     
        lowercase(null);
    }    
}