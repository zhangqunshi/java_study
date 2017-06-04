package com.nastation.c09;

import java.util.ArrayList;
import java.util.Iterator;

class Hamster {
    private int hamsterNumber;

    Hamster(int i) {
        hamsterNumber = i;
    }

    public String toString() {
        return "This is Hamster #" + hamsterNumber;
    }
}

class Printer {
    static void printAll(Iterator e) {
        while (e.hasNext())
            System.out.println(e.next());
    }
}

public class HamsterMaze {
    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        for (int i = 0; i < 3; i++) {
            v.add(new Hamster(i));
        }
        Printer.printAll(v.iterator());
    }
}