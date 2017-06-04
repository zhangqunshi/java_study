//package com.nastation.c8b;

public class IndexOfTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = "abcdefg";
        int i1 = a.indexOf("d");
        int i2 = a.indexOf("x");
        int i3 = a.indexOf("e", -9);
        int i4 = a.indexOf("e", 19);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }

}
