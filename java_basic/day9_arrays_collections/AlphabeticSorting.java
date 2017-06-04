import java.util.Arrays;

public class AlphabeticSorting {

    public static void main(String[] args) {

        String[] sa = new String[30];
        Arrays2.fill(sa, new Arrays2.RandStringGenerator(5));
        Arrays2.print("Before sorting: ", sa);
        Arrays.sort(sa, new AlphabeticComparator());
        Arrays2.print("After sorting: ", sa);
    }
}
