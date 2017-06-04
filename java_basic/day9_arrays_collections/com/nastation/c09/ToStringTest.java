package com.nastation.c09;

public class ToStringTest {

    int i = 9;

    public String toString() {
        return "Kris made this value to " + i;
    }


    public static void main(String[] args) {
        ToStringTest tt = new ToStringTest();
        System.out.println(tt);
    }

}
