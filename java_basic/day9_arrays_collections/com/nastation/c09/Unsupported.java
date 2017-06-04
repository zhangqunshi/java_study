package com.nastation.c09;

//: c09:Unsupported.java
//Sometimes methods defined in the
//Collection interfaces don't work!

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Unsupported {

    private static String[] s = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",};

    static List a = Arrays.asList(s);

    static List a2 = a.subList(3, 6);

    public static void main(String[] args) {
//		System.out.println(a);
//		System.out.println(a2);
//		System.out.println("a.contains(" + s[0] + ") = " + a.contains(s[0]));
//		System.out.println("a.containsAll(a2) = " + a.containsAll(a2));
//		System.out.println("a.isEmpty() = " + a.isEmpty());
//		System.out.println("a.indexOf(" + s[5] + ") = " + a.indexOf(s[5]));

        // Traverse backwards:
        ListIterator lit = a.listIterator(a.size());
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();
        System.out.println();

        // Set the elements to different values:
        for (int i = 0; i < a.size(); i++) {
            a.set(i, "47");
        }
        System.out.println(a);

        // Compiles, but won't run:
//		lit.add("X"); // Unsupported operation
//		a.clear(); // Unsupported
//		a.add("eleven"); // Unsupported
//		a.addAll(a2); // Unsupported
//		a.retainAll(a2); // Unsupported
//		a.remove(s[0]); // Unsupported
//		a.removeAll(a2); // Unsupported
//		
//		a2.add("10");
    }
}