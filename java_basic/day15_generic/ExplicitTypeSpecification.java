import java.util.*;
public class ExplicitTypeSpecification {


    public static void f(Map<String, List<? extends String>> pets) {

    }
    
    public static void main(String[] args) {
        f(New.<String, List<? extends String>>map());
    }
}