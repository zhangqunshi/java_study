package com.nastation.c8b;

public class LastIndexOfTest {

    public static void main(String[] args) {
        String a = "abcdebfjg8";

        int i1 = a.lastIndexOf("b");
        int i2 = a.lastIndexOf("x");
        int i3 = a.lastIndexOf("e", -9);
        int i4 = a.lastIndexOf("b", 100);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }

}
