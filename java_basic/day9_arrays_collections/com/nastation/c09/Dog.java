package com.nastation.c09;

public class Dog {
    private int dogNumber;

    Dog(int i) {
        dogNumber = i;
    }

    void print() {
        System.out.println("Dog #" + dogNumber);
    }
}