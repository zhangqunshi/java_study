package com.nastation.c09;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class A implements Comparator {

    public int compare(Object arg0, Object arg1) {
        B a = (B) arg0;
        B b = (B) arg1;
        return -1;
    }
}

class B implements Comparable {
    int i;

    B(int i) {
        this.i = i;
    }


    public boolean equals(Object obj) {
        B x = (B) obj;
        if (this.i == x.i) {
            return true;
        }
        return false;
    }


    public int compareTo(Object arg0) {
        return -1;
    }
}

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        B b1 = new B(1);
        B b2 = new B(1);

        System.out.println(b1.equals(b2));

        Set s = new HashSet();
        System.out.println(s.add(b1));
        System.out.println(s.add(b2));
        System.out.println(s);
    }

}
