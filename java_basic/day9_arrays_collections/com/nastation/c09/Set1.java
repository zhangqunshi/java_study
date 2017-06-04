package com.nastation.c09;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    static Collections2.StringGenerator gen = Collections2.countries;

    public static void testVisual(Set a) {
        Collections2.fill(a, gen.reset(), 10);
        Collections2.fill(a, gen.reset(), 10);
        Collections2.fill(a, gen.reset(), 10);
        System.out.println(a); // No duplicates!
        System.out.println(a.size());

        // Add another set to this one:
        a.addAll(a);
        a.add("one");
        a.add("one");
        a.add("one");
        System.out.println(a);

        // Look something up:
        System.out.println("a.contains(\"one\"): " + a.contains("one"));
    }

    public static void main(String[] args) {
        System.out.println("HashSet");
        testVisual(new HashSet());
        System.out.println("TreeSet");
        testVisual(new TreeSet());
    }
}