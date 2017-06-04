package com.nastation.c09;

//: c09:Set2.java
//Putting your own type in a Set.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class MyType implements Comparable {

    private int i;

    public MyType(int n) {
        i = n;
    }

    public boolean equals(Object o) {
        return (o instanceof MyType) && (i == ((MyType) o).i);
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + " ";
    }

    public int compareTo(Object o) {
        int i2 = ((MyType) o).i;
//		return 0;
        return (i < i2 ? -1 : (i == i2 ? 0 : 1));
        // return (i2 < i ? -1 : (i2 == i ? 0 : 1));
    }
}

public class Set2 {

    public static Set fill(Set a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(new MyType(i));
        }
        return a;
    }

    public static void test(Set a) {
        fill(a, 10);
        fill(a, 10); // Try to add duplicates
        fill(a, 10);
        // a.addAll(fill(new TreeSet(), 10));
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(new HashSet());
        test(new TreeSet());
    }
}