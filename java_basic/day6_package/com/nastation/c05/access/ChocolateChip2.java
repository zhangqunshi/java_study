package com.nastation.c05.access;

import com.nastation.c05.Cookie;


class ChocolateChip2 {

    public ChocolateChip2() {
        System.out.println("ChocolateChip constructor");
    }

    public static void main(String[] args) {
        Cookie c = new Cookie();
        // c.bite2(); // Can't access bite
    }
}
