package com.nastation.c8b;

public class ReplaceTest {

    public static void main(String[] args) {
        String a = "Hello, world";
        String c = "Hi, world";

        String tmp1 = a.replaceAll("Hello", "Hi");
        String tmp2 = c.replaceAll("Hello", "Hi");

        System.out.println(tmp1);
        System.out.println(tmp2);
    }

}
