package com.nastation.c09;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet(Arrays.asList("one two three four five six seven eight".split(" ")));
        System.out.println(sortedSet);

        Object low = sortedSet.first(), high = sortedSet.last();
        System.out.println(low);
        System.out.println(high);

        Iterator it = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) {
                low = it.next();
            } else if (i == 6) {
                high = it.next();
            } else {
                System.out.println(i + "----" + it.next());
            }
        }

        System.out.println(low);
        System.out.println(high);
        System.out.println(sortedSet.subSet(low, high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(sortedSet.tailSet(low));
    }
}