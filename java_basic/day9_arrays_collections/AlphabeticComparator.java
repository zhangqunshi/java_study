import java.util.Comparator;

public class AlphabeticComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }
} // /:~
