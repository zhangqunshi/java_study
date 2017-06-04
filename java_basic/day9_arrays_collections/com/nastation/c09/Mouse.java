package com.nastation.c09;

public class Mouse {

    private int mouseNumber;

    Mouse(int i) {
        mouseNumber = i;
    }

    // Override Object.toString():
    public String toString() {
        return "This is Mouse #" + mouseNumber;
    }

    public int getNumber() {
        return mouseNumber;
    }
}