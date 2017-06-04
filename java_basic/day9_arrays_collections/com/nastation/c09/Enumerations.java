package com.nastation.c09;

//: c09:Enumerations.java
//Java 1.0/1.1 Vector and Enumeration.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

class Enumerations {
    public static void main(String[] args) {

        Vector v = new Vector();
        Collections2.fill(v, Collections2.countries, 100);

        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

        // Produce an Enumeration from a Collection:
        e = Collections.enumeration(new ArrayList());
    }
}