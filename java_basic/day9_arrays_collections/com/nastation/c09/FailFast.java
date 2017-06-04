package com.nastation.c09;

//: c09:FailFast.java
//Demonstrates the "fail fast" behavior.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FailFast {

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        Iterator it = c.iterator();
        c.add("An object");
//		Iterator it = c.iterator();
        // Causes an exception:
        String s = (String) it.next();
    }
}