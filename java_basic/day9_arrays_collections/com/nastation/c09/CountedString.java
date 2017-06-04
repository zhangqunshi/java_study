package com.nastation.c09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CountedString {
    private String s;

    private int id = 0;

    private static ArrayList created = new ArrayList();

    public CountedString(String str) {
        s = str;
        created.add(s);
        Iterator it = created.iterator();

        // Id is the total number of instances
        // of this string in use by CountedString:
        while (it.hasNext())
            if (it.next().equals(s))
                id++;
    }

    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode()
                + "\n";
    }

    public int hashCode() {
        return s.hashCode() * id;
    }

    public boolean equals(Object o) {
        return (o instanceof CountedString) && s.equals(((CountedString) o).s)
                && id == ((CountedString) o).id;
    }

    public static void main(String[] args) {
        HashMap m = new HashMap();
        CountedString[] cs = new CountedString[10];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi");
            m.put(cs[i], new Integer(i));
        }
        System.out.println(m);
        for (int i = 0; i < cs.length; i++) {
            System.out.print("Looking up " + cs[i]);
            System.out.println(m.get(cs[i]));
        }
    }
}