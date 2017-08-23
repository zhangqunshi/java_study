import java.util.*;
import java.lang.reflect.*;

enum Explore {
    HERE, THRERE
}

public class Reflection {

    public static Set<String> analyze(Class<?> c) {
        System.out.println("----- Analyze " + c + " -----");
        System.out.print("Interface: ");
        for(Type t : c.getGenericInterfaces()) {
            System.out.print(t + ", ");
        }
        System.out.println();

        System.out.println("Base: " + c.getSuperclass());

        System.out.print("Methods: ");
        Set<String> set = new TreeSet<>();
        for (Method m : c.getMethods()) {
            set.add(m.getName());
        }
        System.out.println(set);
        return set;
    }

    public static void main(String[] args) {
        Set<String> x = Reflection.analyze(Explore.class);
        Set<String> y = Reflection.analyze(Enum.class);

        System.out.println("Explore method contains all Enum method: " + x.containsAll(y));
        System.out.println("Explore remove Enum methods: " + x.removeAll(y));
        System.out.println(x);
    }

}
