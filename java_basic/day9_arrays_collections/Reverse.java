//: c09:Reverse.java
// The Collecions.reverseOrder() Comparator.

import java.util.Arrays;
import java.util.Collections;

;

public class Reverse {
    public static void main(String[] args) {
        CompType[] a = new CompType[10];
        Arrays2.fill(a, CompType.generator());
        Arrays2.print("before sorting, a = ", a);
        Arrays.sort(a, Collections.reverseOrder());
        Arrays2.print("after sorting, a = ", a);
    }
}