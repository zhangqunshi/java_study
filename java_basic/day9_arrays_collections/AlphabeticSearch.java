//: c09:AlphabeticSearch.java
// Searching with a Comparator.

import java.util.Arrays;

public class AlphabeticSearch {

    public static void main(String[] args) {

        String[] sa = new String[30];
        Arrays2.fill(sa, new Arrays2.RandStringGenerator(5));
        AlphabeticComparator comp = new AlphabeticComparator();
        Arrays.sort(sa, comp);
        Arrays2.print(sa);
        System.out.println(sa[10]);
        int index = Arrays.binarySearch(sa, "FvjKT", comp);
        System.out.println("Index = " + index);


        String[] a = {"1", "2", "3", "2", "5"};
        int i = Arrays.binarySearch(a, "2");
        System.out.println("i=" + i);
    }

}
