package com.nastation.c09;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("c");

        System.out.println(a);

        ListIterator it = a.listIterator();
        it.next();
        it.add("12");
        it.previous();
        it.previous();
        it.add("11");
        it.previous();
        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }
    }

}
