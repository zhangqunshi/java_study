package com.nastation.c05.access;

import com.nastation.c05.Cookie;


public class ChocolateChip extends Cookie {

    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        //x.bite(); // Can't access bite
        //x.bite2(); // Can't access bite
    }

    int add(int x, int y) {
        return x + y;
    }
}
