package com.nastation.c09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TestContains {

    public static void main(String[] args) {
        TreeSet a = new TreeSet();
        ArrayList b = new ArrayList();
        a.add("2");
        a.add("1");
        a.add("3");

        b.add("2");
        b.add("1");
        b.add("3");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a.contains("2"));
        System.out.println(a.containsAll(b));

        System.out.println(a);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(a);

        b.add(0, "xx");
        System.out.println(b);
        b.set(2, "yy");
        System.out.println(b);

//		Integer[] xx = new Integer[0];
        String[] yy = (String[]) b.toArray(new String[0]);


    }

}
