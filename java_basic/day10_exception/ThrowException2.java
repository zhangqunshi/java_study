
public class ThrowException2 {

    public static String lowercase(String s) throws Exception {
        if (s == null) {
            // do something here
            System.out.println("Wrong s");
            throw new Exception("This is null point exception :-----) ");
            // return "";
        }
        return s.toLowerCase();        
    }

    public static void main(String[] args) throws Exception {
        System.out.println(lowercase("HELLO"));     
        lowercase(null);
    }    
}