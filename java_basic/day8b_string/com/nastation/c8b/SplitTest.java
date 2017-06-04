package com.nastation.c8b;

public class SplitTest {
    public static void main(String[] args) {
        String a = "1 2 3 4";

        String[] tmp = a.split(" ");

        System.out.println(tmp.length);

        for (int i = 0; i < tmp.length; i++) {
            System.out.print(" " + tmp[i]);
        }
    }
}
