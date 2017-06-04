package com.nastation.c09;

//: c09:Iterators2.java
//Revisiting Iterators.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class PrintData {
    static void print(Iterator e) {
        while (e.hasNext())
            System.out.println(e.next());
    }
}

class Iterators2 {
    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        for (int i = 0; i < 5; i++)
            v.add(new Mouse(i));

        HashMap m = new HashMap();
        for (int i = 0; i < 5; i++)
            m.put(new Integer(i), new Hamster(i));

        System.out.println("ArrayList");
        PrintData.print(v.iterator());
        System.out.println("HashMap");
        PrintData.print(m.entrySet().iterator());
    }
}