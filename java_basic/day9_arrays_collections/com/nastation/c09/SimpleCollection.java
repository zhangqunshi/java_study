package com.nastation.c09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleCollection {

    public static void main(String[] args) {

        // Upcast because we just want to
        // work with Collection features
        Collection c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(Integer.toString(i));
        }

        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}