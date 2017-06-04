package com.nastation.c8b;

public class TrimTest {

    public static void main(String[] args) {
        String a = "   1 2 3 4 ";
        System.out.println(a.length());

        String tmp = a.trim();

        System.out.println(tmp.length());
        System.out.println(tmp);

    }

}
