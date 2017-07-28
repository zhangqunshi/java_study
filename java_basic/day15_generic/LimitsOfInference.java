import java.util.*;

public class LimitsOfInference {

    public static void f(Map<String, List<? extends String>> pets) {

    }

    public static void main(String[] args) {
        f(New.map());
    }
}