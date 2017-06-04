package com.nastation.c8b;

public class CompareStringTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = "a23";
        String b = "456";
        String c = "123";
        String d = "0";
        String e = "abc";
        String f = "xyz";
        String g = "xyz00000";

        String k = "ABC";


        int i1 = a.compareTo(b);
        int i2 = a.compareTo(c);
        int i3 = a.compareTo(d);
        int i4 = a.compareTo(e);
        int i5 = e.compareTo(f);
        int i6 = f.compareTo(g);

        int i7 = e.compareToIgnoreCase(k);

        System.out.println("Result is " + i1);
        System.out.println("Result is " + i2);
        System.out.println("Result is " + i3);
        System.out.println("Result is " + i4);
        System.out.println("Result is " + i5);
        System.out.println("Result is " + i6);

        System.out.println("Result is " + i7);


    }

}
